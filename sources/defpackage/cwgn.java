package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwgn implements cwgj {
    public static final cskc a = cskc.g("BugleProfiles", "ProfileSuggestionsAdapterImpl");
    public final Context b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final cpdg f;
    public final elho g;
    public final ffbr h;
    public final ffbr i;
    public final atmf j;
    private final ffsk k;
    private final cwhc l;
    private final cwis m;
    private final ffxx n;
    private final fgdj o;

    public cwgn(ffsk ffskVar, Context context, cwhc cwhcVar, ffbr ffbrVar, cwis cwisVar, ffbr ffbrVar2, ffbr ffbrVar3, cpdg cpdgVar, elho elhoVar, ffbr ffbrVar4, ffbr ffbrVar5, atmf atmfVar) {
        ffskVar.getClass();
        context.getClass();
        cwhcVar.getClass();
        ffbrVar.getClass();
        cwisVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        cpdgVar.getClass();
        elhoVar.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.k = ffskVar;
        this.b = context;
        this.l = cwhcVar;
        this.c = ffbrVar;
        this.m = cwisVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = cpdgVar;
        this.g = elhoVar;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = atmfVar;
        ffxx b = cwhcVar.b();
        this.n = b;
        fgch fgchVar = new fgch(b, cwisVar.a(), new cwgm(this));
        int i = fgcz.a;
        this.o = fgbn.b(fgchVar, ffskVar, fgcy.a(0L, 3), new cwgi(null));
    }

    public static final aoku b(ffbz ffbzVar) {
        return (aoku) ffbzVar.a();
    }

    @Override // defpackage.cwgj
    public final fgdj a() {
        return this.o;
    }
}
