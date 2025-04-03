package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xck implements wqq {
    public final Context a;
    public final ffsk b;
    public final ffbr c;
    public final ffbr d;
    public final aswl e;
    public final cvge f;
    public final cvgj g;
    public final ffbr h;
    public final ffbr i;
    public final avbn j;
    public final ffbr k;
    public final fgcm l;
    public final Map m;
    public final ffxx n;
    private final cvgm o;
    private final fgcq p;
    private final ffxx q;
    private final Set r;

    public xck(Context context, ffsk ffskVar, ffbr ffbrVar, ffxx ffxxVar, ffxx ffxxVar2, ffxx ffxxVar3, ffxx ffxxVar4, ffbr ffbrVar2, aswl aswlVar, cvge cvgeVar, cvgj cvgjVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, avbn avbnVar, cvgm cvgmVar, ffbr ffbrVar6, fgcq fgcqVar) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ffxxVar3.getClass();
        ffxxVar4.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffbrVar6.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = aswlVar;
        this.f = cvgeVar;
        this.g = cvgjVar;
        this.h = ffbrVar3;
        this.i = ffbrVar5;
        this.j = avbnVar;
        this.o = cvgmVar;
        this.k = ffbrVar6;
        this.p = fgcqVar;
        fgcm a = fgdm.a(false);
        this.l = a;
        fgdj h = ((cnpd) ffbrVar4.b()).h();
        this.q = h;
        ffga ffgaVar = new ffga();
        ffgaVar.put(axzc.a.b, new xbz(dmzz.eD, erca.VIDEO_CALLING_SERVICE_TYPE_WHATSAPP, new xci(cvgmVar)));
        this.m = ffew.b(ffgaVar);
        c();
        this.n = axqw.b(ffxxVar, ffxxVar2, ffxxVar3, a, ffxxVar4, h, fgcqVar, new xcc(this, null));
        this.r = fffi.b(aaxf.a);
    }

    public static final boolean d(engw engwVar) {
        if ((engwVar instanceof Collection) && engwVar.isEmpty()) {
            return true;
        }
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            if (!((aqrv) ((ResolvedRecipient) it.next()).m()).c) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.r;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.n;
    }

    public final void c() {
        axol.k(this.b, null, new xcj(this, null), 3);
    }
}
