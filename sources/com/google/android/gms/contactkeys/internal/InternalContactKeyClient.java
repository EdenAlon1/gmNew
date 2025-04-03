package com.google.android.gms.contactkeys.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.E2eeSelfKeyListParcelable;
import com.google.android.gms.contactkeys.internal.IContactKeyService;
import com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback;
import com.google.android.gms.contactkeys.internal.ISelfKeysCallback;
import defpackage.dfqp;
import defpackage.dfqt;
import defpackage.dfqz;
import defpackage.dfra;
import defpackage.dfuf;
import defpackage.dfun;
import defpackage.dfup;
import defpackage.dgaf;
import defpackage.dgak;
import defpackage.dgar;
import defpackage.dgwg;
import defpackage.dhre;
import defpackage.ffcf;
import defpackage.ffig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient extends dfra implements dgaf {
    private final Context a;

    public InternalContactKeyClient(Context context) {
        super(context, new dfqt("ContactKey.API", dgar.b, dgar.a), dfqp.q, dfqz.a);
        this.a = context;
    }

    @Override // defpackage.dgaf
    public final dhre a() {
        dfun dfunVar = new dfun();
        dfunVar.b = new Feature[]{dgak.a};
        dfunVar.a = new dfuf() { // from class: dgan
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                final dhri dhriVar = (dhri) obj2;
                ((IContactKeyService) ((dgal) obj).w()).getOwnerE2eeSelfKeys(new ISelfKeysCallback.Stub() { // from class: com.google.android.gms.contactkeys.internal.InternalContactKeyClient$getOwnerE2eeSelfKeys$1$callback$1
                    @Override // com.google.android.gms.contactkeys.internal.ISelfKeysCallback
                    public void onResult(Status status, E2eeSelfKeyListParcelable e2eeSelfKeyListParcelable) {
                        status.getClass();
                        e2eeSelfKeyListParcelable.getClass();
                        dfup.b(status, e2eeSelfKeyListParcelable, dhriVar);
                    }
                });
            }
        };
        dfunVar.c = 33905;
        return i(dfunVar.a());
    }

    @Override // defpackage.dgaf
    public final dhre b(final String str, final String str2) {
        dfun dfunVar = new dfun();
        dfunVar.b = new Feature[]{dgak.a};
        dfunVar.a = new dfuf() { // from class: dgao
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                final dhri dhriVar = (dhri) obj2;
                ((IContactKeyService) ((dgal) obj).w()).removeE2eeSelfKey(new IContactKeyStatusCallback.Stub() { // from class: com.google.android.gms.contactkeys.internal.InternalContactKeyClient$removeE2eeSelfKey$1$callback$1
                    @Override // com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback
                    public void onResult(Status status) {
                        status.getClass();
                        dfup.a(status, dhriVar);
                    }
                }, str, str2);
            }
        };
        dfunVar.c = 33916;
        return i(dfunVar.a());
    }

    @Override // defpackage.dgaf
    public final dhre c(final String str, final String str2, final byte[] bArr) {
        bArr.getClass();
        dfun dfunVar = new dfun();
        dfunVar.b = new Feature[]{dgak.a};
        dfunVar.a = new dfuf() { // from class: dgap
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                final dhri dhriVar = (dhri) obj2;
                ((IContactKeyService) ((dgal) obj).w()).updateOrInsertE2eeSelfKey(new IContactKeyStatusCallback.Stub() { // from class: com.google.android.gms.contactkeys.internal.InternalContactKeyClient$updateOrInsertE2eeSelfKey$1$callback$1
                    @Override // com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback
                    public void onResult(Status status) {
                        status.getClass();
                        dfup.a(status, dhriVar);
                    }
                }, str, str2, bArr);
            }
        };
        dfunVar.c = 33908;
        return i(dfunVar.a());
    }

    @Override // defpackage.dgaf
    public final dhre d(final String str, final String str2, final byte[] bArr) {
        final String str3;
        ffcf ffcfVar;
        str2.getClass();
        Context context = this.a;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        Cursor a = dgwg.a(contentResolver, "content://com.android.contacts/data/emails", new String[]{"data1"}, new String[]{str});
        if (a != null) {
            try {
                String string = !a.moveToFirst() ? null : a.getString(a.getColumnIndexOrThrow("data1"));
                ffig.a(a, null);
                str3 = string;
            } finally {
            }
        } else {
            str3 = null;
        }
        Context context2 = this.a;
        context2.getClass();
        ContentResolver contentResolver2 = context2.getContentResolver();
        contentResolver2.getClass();
        a = dgwg.a(contentResolver2, "content://com.android.contacts/data/phones", new String[]{"display_name", "data1"}, new String[]{str});
        if (a == null) {
            ffcfVar = new ffcf(null, null);
        } else {
            try {
                ffcfVar = !a.moveToFirst() ? new ffcf(null, null) : new ffcf(a.getString(a.getColumnIndexOrThrow("display_name")), a.getString(a.getColumnIndexOrThrow("data1")));
                ffig.a(a, null);
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        Object obj = ffcfVar.b;
        final String str4 = (String) ffcfVar.a;
        final String str5 = (String) obj;
        dfun dfunVar = new dfun();
        dfunVar.b = new Feature[]{dgak.a};
        dfunVar.a = new dfuf() { // from class: dgam
            public final /* synthetic */ String b = "google_messages_v1";

            @Override // defpackage.dfuf
            public final void a(Object obj2, Object obj3) {
                final dhri dhriVar = (dhri) obj3;
                ((IContactKeyService) ((dgal) obj2).w()).updateOrInsertE2eeContactKey(new IContactKeyStatusCallback.Stub() { // from class: com.google.android.gms.contactkeys.internal.InternalContactKeyClient$updateOrInsertE2eeContactKey$1$callback$1
                    @Override // com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback
                    public void onResult(Status status) {
                        status.getClass();
                        dfup.a(status, dhriVar);
                    }
                }, str, this.b, str2, bArr, str3, str4, str5);
            }
        };
        dfunVar.c = 33907;
        return i(dfunVar.a());
    }
}
