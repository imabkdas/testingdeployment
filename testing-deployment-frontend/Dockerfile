# Use the official Node.js runtime as the base image
FROM node:20-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy package files and install dependencies
COPY package*.json ./
RUN npm install

# Copy the source code to the container
COPY . .

# Build the React app
RUN npm run build

# Install 'serve' to serve the app
# RUN npm install -g serve

# Expose the desired port (e.g., 3000)
EXPOSE 3000

# Command to run the app
CMD ["npm", "start"]
