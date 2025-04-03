package com.google.android.apps.messaging.conversation2.viewmodel;

import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aapm;
import defpackage.abcx;
import defpackage.abcy;
import defpackage.abdj;
import defpackage.abpv;
import defpackage.abqb;
import defpackage.abqc;
import defpackage.abqd;
import defpackage.aewa;
import defpackage.aewb;
import defpackage.aigx;
import defpackage.aigz;
import defpackage.atti;
import defpackage.attl;
import defpackage.axol;
import defpackage.bdgq;
import defpackage.cfup;
import defpackage.cnpd;
import defpackage.cnpk;
import defpackage.ctjd;
import defpackage.dltj;
import defpackage.dpla;
import defpackage.ffbr;
import defpackage.fflm;
import defpackage.ffsk;
import defpackage.ffxx;
import defpackage.lml;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationViewModel extends lml {
    public final ConversationId a;
    public final abdj b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final aigz l;
    public final aigx m;
    public final ffxx n;
    public final dpla o;
    public final aapm p;
    public final dltj q;
    private final ffsk r;
    private final boolean s;

    /* JADX WARN: Type inference failed for: r4v31, types: [ajcx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32, types: [ajbd, java.lang.Object] */
    public ConversationViewModel(ConversationId conversationId, ffsk ffskVar, abdj abdjVar, ffbr ffbrVar, aapm aapmVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, boolean z, ffbr ffbrVar8, ffbr ffbrVar9, aigz aigzVar, aigx aigxVar, dltj dltjVar, ffxx ffxxVar, Optional optional, ffxx ffxxVar2, Optional optional2, Optional optional3, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13) {
        conversationId.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar9.getClass();
        aigzVar.getClass();
        aigxVar.getClass();
        dltjVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ffbrVar10.getClass();
        ffbrVar11.getClass();
        ffbrVar12.getClass();
        ffbrVar13.getClass();
        this.a = conversationId;
        this.r = ffskVar;
        this.b = abdjVar;
        this.c = ffbrVar;
        this.p = aapmVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.i = ffbrVar7;
        this.s = z;
        this.j = ffbrVar8;
        this.k = ffbrVar9;
        this.l = aigzVar;
        this.m = aigxVar;
        this.q = dltjVar;
        this.n = ffxxVar;
        dpla dplaVar = (dpla) fflm.b(optional);
        this.o = dplaVar == null ? new abqc() : dplaVar;
        axol.k(ffskVar, null, new abpv(ffxxVar2, this, null), 3);
        ((abqd) ffbrVar11.b()).a();
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            optional2.isPresent();
            optional2.get().a();
        }
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            optional3.isPresent();
            optional3.get().a();
        }
        if (!((atti) ffbrVar13.b()).a()) {
            abcy abcyVar = (abcy) ffbrVar12.b();
            ConversationIdType b = bdgq.b(abcyVar.f.b());
            if (!b.equals(bdgq.a)) {
                abcyVar.a((cnpk) ((cnpd) abcyVar.b.b()).h().c(), b, true);
                axol.k(abcyVar.c, null, new abcx(abcyVar, b, null), 3);
            }
        }
        aewb aewbVar = (aewb) ffbrVar10.b();
        axol.k(aewbVar.a, null, new aewa(aewbVar, null), 3);
        fA(new AutoCloseable() { // from class: abpq
            @Override // java.lang.AutoCloseable
            public final void close() {
                Iterator it = ((Set) ConversationViewModel.this.c.b()).iterator();
                while (it.hasNext()) {
                    ((abqq) it.next()).close();
                }
            }
        });
        if (((attl) ffbrVar9.b()).a() && z) {
            axol.k(ffskVar, null, new abqb(this, null), 3);
        }
    }
}
