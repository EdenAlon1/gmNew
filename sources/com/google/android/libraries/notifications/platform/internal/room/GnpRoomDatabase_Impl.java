package com.google.android.libraries.notifications.platform.internal.room;

import defpackage.eaob;
import defpackage.eaoc;
import defpackage.eaod;
import defpackage.eaoe;
import defpackage.eaof;
import defpackage.eaog;
import defpackage.eaoh;
import defpackage.eaoi;
import defpackage.eapq;
import defpackage.eapz;
import defpackage.osg;
import defpackage.otf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class GnpRoomDatabase_Impl extends GnpRoomDatabase {
    private volatile eapq l;

    @Override // defpackage.otb
    protected final osg a() {
        return new osg(this, new HashMap(0), new HashMap(0), "gnp_accounts");
    }

    @Override // defpackage.otb
    protected final /* synthetic */ otf c() {
        return new eaoi(this);
    }

    @Override // defpackage.otb
    protected final Map g() {
        HashMap hashMap = new HashMap();
        hashMap.put(eapq.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // defpackage.otb
    public final Set h() {
        return new HashSet();
    }

    @Override // defpackage.otb
    public final List v() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new eaob());
        arrayList.add(new eaoc());
        arrayList.add(new eaod());
        arrayList.add(new eaoe());
        arrayList.add(new eaof());
        arrayList.add(new eaog());
        arrayList.add(new eaoh());
        return arrayList;
    }

    @Override // com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase
    public final eapq x() {
        eapq eapqVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new eapz(this);
            }
            eapqVar = this.l;
        }
        return eapqVar;
    }
}
