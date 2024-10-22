---
title: Overview
---
The CICS Bank Sample Application (CBSA) simulates the operation of a bank from the point of view of the Bank Teller. It can be used for teaching, testing, and as a conversation piece for application development lifecycle discussions.

The CICS Bank Sample Application (CBSA) is made up of several parts:&nbsp;

- base/COBOL installation, which must be installed before the other parts.&nbsp;
- Liberty User Interface.
- Payment User Interface.
- Customer Services User Interface.

## Main Components

### Bank Backend (base)

The Bank Backend is responsible for handling the backend functionality of the bank application.

- <SwmLink doc-title="Fetching customer accounts (Program INQACCCU)">[Fetching customer accounts (Program INQACCCU)](/.swm/fetching-customer-accounts-program-inqacccu.c1txv.sw.md)</SwmLink>
- <SwmLink doc-title="Program ACCTCTRL">[Program ACCTCTRL](/.swm/program-acctctrl.uj6lc.sw.md)</SwmLink>

### Carbon React Front-End (Liberty Use interface)

Carbon React Front-End Framework for CBSA

- <SwmLink doc-title="Carbon React Front-End Overview">[Carbon React Front-End Overview](/.swm/carbon-react-front-end-overview.h0i6w2mc.sw.md)</SwmLink>
- **Customer details page**
  - <SwmLink doc-title="Customer details page">[Customer details page](.swm/customer-details-page.kmu5ng91.sw.md)</SwmLink>
- **Account details page**
  - <SwmLink doc-title="Account details page">[Account details page](.swm/account-details-page.1rv031gz.sw.md)</SwmLink>

### Customer Services

The main idea of Customer Services is to reduce people's queueing time by deploying staff as 'queue busters' at peak times. They will be armed with a tablet and will walk the queue to perform some of the functions of the Teller. The bank doesn't want the queue busters to become a target for robbery, so the tasks that they can perform (via the Customer Services interface) are more administrative in nature.

- <SwmLink doc-title="Customer Services Overview">[Customer Services Overview](/.swm/customer-services-overview.ptqw20of.sw.md)</SwmLink>

### Flows

- <SwmLink doc-title="Create customer flow">[Create customer flow](/.swm/create-customer-flow.gumch21h.sw.md)</SwmLink>

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBY2ljcy1iYW5raW5nLXNhbXBsZS1hcHBsaWNhdGlvbi1jYnNhLUlCTS1EZW1vJTNBJTNBU3dpbW0tRGVtbw==" repo-name="cics-banking-sample-application-cbsa"><sup>Powered by [Swimm](https://staging.swimm.cloud/)</sup></SwmMeta>
