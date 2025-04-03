package com.google.android.libraries.onegoogle.accountmenu.cards.db;

import defpackage.ebfi;
import defpackage.ebfj;
import defpackage.ebfk;
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
public final class CardsDatabase_Impl extends CardsDatabase {
    @Override // defpackage.otb
    protected final osg a() {
        return new osg(this, new HashMap(0), new HashMap(0), "StorageCardDecorationState", "BackupSyncCardDecorationState");
    }

    @Override // defpackage.otb
    protected final /* synthetic */ otf c() {
        return new ebfj(this);
    }

    @Override // defpackage.otb
    protected final Map g() {
        HashMap hashMap = new HashMap();
        hashMap.put(ebfk.class, Collections.EMPTY_LIST);
        hashMap.put(ebfi.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // defpackage.otb
    public final Set h() {
        return new HashSet();
    }

    @Override // defpackage.otb
    public final List v() {
        return new ArrayList();
    }
}
