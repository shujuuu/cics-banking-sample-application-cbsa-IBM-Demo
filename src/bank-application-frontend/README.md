# bank-application-frontend

Repo for using Carbon React Front-End Framework for CBSA and the code changes associated with it.

## Requirements

This project was generated with [React JS](https://react.dev/) version 16.0.0. You can install this package using NPM package manager. Ensure you use a npm version that compatible with NodeJS (i.e. NPM 6.14.18 for NodeJS 14.21.3.) The minimum required version of NodeJS is 4.9.1.

## Install Dependencies

Run npm install , or npm i , is used to install dependencies: It will install all the dependencies to the local node_modules folder based on the definition in package-json.

## Getting Started

Run ng serve for a dev server. Navigate to http://localhost:4200/. The application will automatically reload if you change any of the source files.

## Important to note

The back-end implementation of Customer Name search is designed to drive java workload, so is MUCH slower to return results than customer number search.

## Known issues/Areas for improvement

Front-end:
- Account expansion rows when showing multiple customers (ie. by name search) is disabled due to an issue with the expansion row implementation (it cannot currently differentiate between different customers correctly when a row is expanded, so all customers will show the same set of accounts. The expanded row headers still appear but no data will appear.
- There is currently no error modal shown if there are no results to show, the table just remains empty.
- When creating or editing a customer/account, if there is an issue (i.e. missing D.O.B) the error modal is generic and doesn't pinpoint where the error is, it just states that there is an error somewhere in the user entry fields.
- Users are required to login before accessing the admin panel, but there are no actual login credentials required, users just need to press submit.
