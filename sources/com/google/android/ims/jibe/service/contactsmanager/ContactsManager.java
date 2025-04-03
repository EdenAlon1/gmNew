package com.google.android.ims.jibe.service.contactsmanager;

import android.content.Context;
import android.os.Binder;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.IContactsManagement;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import defpackage.dkhx;
import defpackage.dkhz;
import defpackage.dkqd;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ContactsManager extends IContactsManagement.Stub {
    private final Context a;
    private final dkhx b;

    public ContactsManager(Context context, dkhx dkhxVar) {
        this.a = context;
        this.b = dkhxVar;
    }

    @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
    public ContactsServiceResult forceRefreshCapabilities(String str) {
        dkqd.d(this.a, Binder.getCallingUid());
        return this.b.a(str);
    }

    @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
    public ImsCapabilities getCachedCapabilities(String str) {
        dkqd.d(this.a, Binder.getCallingUid());
        return dkhz.b(this.b.c(str));
    }

    @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
    public ContactsServiceResult refreshCapabilities(String str) {
        dkqd.d(this.a, Binder.getCallingUid());
        return this.b.b(str, 0);
    }
}
