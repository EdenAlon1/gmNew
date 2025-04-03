package com.google.android.libraries.geller.portable;

import defpackage.dugs;
import defpackage.enip;
import defpackage.enpd;
import defpackage.enqu;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class GellerStorageChangeListenerHandler {
    private enip a;

    public GellerStorageChangeListenerHandler(enip enipVar) {
        this.a = enpd.a;
        if (enipVar != null) {
            this.a = enipVar;
        }
    }

    void notifyOnDeletion(String str, String str2) {
        enqu listIterator = this.a.listIterator();
        while (listIterator.hasNext()) {
            ((dugs) listIterator.next()).a();
        }
    }
}
