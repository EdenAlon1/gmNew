package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aibn implements aibc {
    public final Context a;
    public final ffbr b;
    public final ffbr c;
    public final alxl d;
    public final ffbr e;
    public final ffbr f;
    public final cuxh g;
    public final ffbr h;
    public final ffbr i;
    public final ecrj j;
    public final fgcm k;
    private final ffsk l;
    private final fgdj m;
    private final fgdj n;

    public aibn(Context context, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ahuu ahuuVar, alxl alxlVar, ffbr ffbrVar3, ffbr ffbrVar4, cuxh cuxhVar, ffbr ffbrVar5, ffbr ffbrVar6, ecrj ecrjVar, llv llvVar) {
        Long l;
        context.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ahuuVar.getClass();
        alxlVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        cuxhVar.getClass();
        ffbrVar6.getClass();
        ecrjVar.getClass();
        llvVar.getClass();
        this.a = context;
        this.l = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = alxlVar;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = cuxhVar;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ecrjVar;
        Bundle bundle = (Bundle) llvVar.b("conversation_list_bundle_key");
        if (bundle != null) {
            Object b = ffbrVar.b();
            b.getClass();
            l = Long.valueOf(bundle.getLong("conversation_list_limit_key", ((Number) b).longValue()));
        } else {
            l = (Long) ffbrVar.b();
        }
        fgcm a = fgdm.a(l);
        this.k = a;
        llvVar.e("conversation_list_bundle_key", new owu() { // from class: aibe
            @Override // defpackage.owu
            public final Bundle a() {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("conversation_list_limit_key", ((Number) aibn.this.k.c()).longValue());
                return bundle2;
            }
        });
        aibm aibmVar = new aibm(a, this);
        int i = fgcz.a;
        fgdj b2 = fgbn.b(aibmVar, ffskVar, fgcy.a(0L, 3), new aibh(null));
        this.m = b2;
        this.n = fgbn.b(new fgch(ahuuVar.b(), b2, new aibj(this, ahuuVar, null)), ffskVar, fgcy.a(0L, 3), new aibo(false, 7));
    }

    @Override // defpackage.aibc
    public final fgdj a() {
        return this.n;
    }
}
