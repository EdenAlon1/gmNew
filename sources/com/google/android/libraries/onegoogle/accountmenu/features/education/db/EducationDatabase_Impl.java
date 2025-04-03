package com.google.android.libraries.onegoogle.accountmenu.features.education.db;

import defpackage.ebji;
import defpackage.ebjl;
import defpackage.ebjy;
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
public final class EducationDatabase_Impl extends EducationDatabase {
    private volatile ebjl l;

    @Override // defpackage.otb
    protected final osg a() {
        return new osg(this, new HashMap(0), new HashMap(0), "EducationState", "HighlightState");
    }

    @Override // defpackage.otb
    protected final /* synthetic */ otf c() {
        return new ebji(this);
    }

    @Override // defpackage.otb
    protected final Map g() {
        HashMap hashMap = new HashMap();
        hashMap.put(ebjl.class, Collections.EMPTY_LIST);
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

    @Override // com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase
    public final ebjl y() {
        ebjl ebjlVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new ebjy(this);
            }
            ebjlVar = this.l;
        }
        return ebjlVar;
    }
}
