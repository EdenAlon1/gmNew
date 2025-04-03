package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvnv {
    public final ffbr a;
    public final ffbr b;
    private final ffbr c;

    public cvnv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.c = ffbrVar;
        this.a = ffbrVar2;
        this.b = ffbrVar3;
    }

    public final boolean a(bcse bcseVar) {
        return cvns.a() ? ((Boolean) ((cfup) cubs.q.get()).e()).booleanValue() && bcseVar.az() && TextUtils.isEmpty(bcseVar.N()) && !bcseVar.A().a() && !bcseVar.aR() && ((cvom) this.c.b()).f : ((Boolean) ((cfup) cubs.q.get()).e()).booleanValue() && bcseVar.az() && TextUtils.isEmpty(bcseVar.N()) && !bcseVar.A().a() && ((cvom) this.c.b()).f;
    }
}
