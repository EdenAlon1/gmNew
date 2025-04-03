package com.google.android.rcs.client.contacts;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.IContactsManagement;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import defpackage.diyv;
import defpackage.diyy;
import defpackage.dkty;
import defpackage.dkuy;
import defpackage.ehxc;
import defpackage.ehxd;
import defpackage.ehxg;
import defpackage.ehxi;
import defpackage.eyrs;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ContactsService extends ehxc<IContactsManagement> {
    public static final diyy h = diyv.b("contacts_service_connection_deprecated");

    public ContactsService(Context context, ehxi ehxiVar, Optional<ehxd> optional) {
        super(IContactsManagement.class, context, ehxiVar, 1, optional);
    }

    @Override // defpackage.ehxc
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    public ContactsServiceResult forceRefreshCapabilities(String str) {
        b();
        if (dkuy.k(this.e) && !dkuy.g(this.e, getRcsServiceMetaDataKey(), 2)) {
            dkty.q("CSApk version does not force refresh capabilities.", new Object[0]);
            return refreshCapabilities(str);
        }
        if (TextUtils.isEmpty(str)) {
            return new ContactsServiceResult(11, "Invalid destination");
        }
        try {
            return ((IContactsManagement) a()).forceRefreshCapabilities(str);
        } catch (Exception e) {
            throw new ehxg(e.getMessage(), e);
        }
    }

    public ImsCapabilities getCachedCapabilities(String str) {
        b();
        try {
            return ((IContactsManagement) a()).getCachedCapabilities(str);
        } catch (Exception e) {
            throw new ehxg(e.getMessage(), e);
        }
    }

    @Override // defpackage.ehxc
    public String getRcsServiceMetaDataKey() {
        return "ContactsServiceVersions";
    }

    @Override // defpackage.ehxc
    public eyrs getServiceNameLoggingEnum() {
        return eyrs.CONTACTS_SERVICE;
    }

    public ContactsServiceResult refreshCapabilities(String str) {
        b();
        if (TextUtils.isEmpty(str)) {
            return new ContactsServiceResult(11, "Invalid destination");
        }
        try {
            return ((IContactsManagement) a()).refreshCapabilities(str);
        } catch (Exception e) {
            throw new ehxg(e.getMessage(), e);
        }
    }
}
