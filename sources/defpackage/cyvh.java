package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyvh implements cyvd {
    public final ffbr a;
    public final auaa b;
    public final ffbr c;
    private final ffsk d;
    private final ffxx e;
    private final ffxx f;
    private final ffbr g;
    private final ffbr h;
    private final atjb i;
    private final cyvq j;

    public cyvh(ffsk ffskVar, ffxx ffxxVar, ffxx ffxxVar2, ffbr ffbrVar, ffbr ffbrVar2, cyvq cyvqVar, ffbr ffbrVar3, atjb atjbVar, auaa auaaVar, ffbr ffbrVar4) {
        ffskVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        cyvqVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.d = ffskVar;
        this.e = ffxxVar;
        this.f = ffxxVar2;
        this.a = ffbrVar;
        this.g = ffbrVar2;
        this.j = cyvqVar;
        this.h = ffbrVar3;
        this.i = atjbVar;
        this.b = auaaVar;
        this.c = ffbrVar4;
    }

    @Override // defpackage.cyvd
    public final fgdj a() {
        fgcm fgcmVar = ((cyxs) this.h.b()).c;
        cyvg cyvgVar = new cyvg(this, null);
        ffxx i = axsp.i(this.e, this.f, this.j.b, fgcmVar, this.d, cyvgVar);
        int i2 = fgcz.a;
        return fgbn.b(i, this.d, fgcy.a(0L, 3), null);
    }

    public final dnym b(final engw engwVar, final Recipient recipient, boolean z) {
        List arrayList;
        Object obj;
        if (recipient != null) {
            if (z) {
                Iterator<E> it = engwVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (ffkj.e(((ResolvedRecipient) obj).g(), recipient.g())) {
                        break;
                    }
                }
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
                arrayList = ffdx.b(resolvedRecipient != null ? resolvedRecipient.G() : null);
            } else {
                arrayList = ffdx.b(recipient.G());
            }
        } else if (engwVar.size() == 1) {
            arrayList = ffdx.b(((ResolvedRecipient) engwVar.get(0)).G());
        } else {
            List v = crjm.v(((azze) this.g.b()).c(crjg.b, engwVar));
            v.getClass();
            ArrayList<Uri> arrayList2 = new ArrayList(ffdx.n(v, 10));
            Iterator it2 = v.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Uri.parse((String) it2.next()));
            }
            if (((ersq) ((atie) this.i).a.b()).a("bugle.enable_group_avatar_thumbnail_fallback")) {
                List v2 = crjm.v(((azze) this.g.b()).c(crjg.a, engwVar));
                v2.getClass();
                ArrayList arrayList3 = new ArrayList(ffdx.n(v2, 10));
                Iterator it3 = v2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Uri.parse((String) it3.next()));
                }
                Iterator it4 = arrayList2.iterator();
                Iterator it5 = arrayList3.iterator();
                ArrayList arrayList4 = new ArrayList(Math.min(ffdx.n(arrayList2, 10), ffdx.n(arrayList3, 10)));
                while (it4.hasNext() && it5.hasNext()) {
                    arrayList4.add(new aqmn((Uri) it4.next(), (Uri) it5.next(), cjwi.PROFILE_UNSPECIFIED_SOURCE));
                }
                arrayList = arrayList4;
            } else {
                arrayList = new ArrayList(ffdx.n(arrayList2, 10));
                for (Uri uri : arrayList2) {
                    arrayList.add(new aqmn(uri, crjm.m(uri), cjwi.PROFILE_UNSPECIFIED_SOURCE));
                }
            }
        }
        List<aqmn> aa = ffdx.aa(arrayList);
        ArrayList arrayList5 = new ArrayList(ffdx.n(aa, 10));
        for (aqmn aqmnVar : aa) {
            Uri uri2 = aqmnVar.a;
            if (uri2 == null) {
                return null;
            }
            Uri n = crjm.n(uri2);
            if (n == null) {
                n = uri2.buildUpon().appendQueryParameter("sz", crjg.b.c).build();
            }
            Uri uri3 = n;
            Uri uri4 = aqmnVar.b;
            uri3.getClass();
            arrayList5.add(new dnwn(uri3, false, crps.a(((crjx) this.a.b()).g()), null, uri4, 8));
        }
        return new dnyn(arrayList5, dnyl.b, 0.01f, new ffix() { // from class: cyvf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ffix
            public final Object invoke() {
                Recipient recipient2 = recipient;
                ResolvedRecipient resolvedRecipient2 = null;
                if (recipient2 != null) {
                    Iterator<E> it6 = engwVar.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        Object next = it6.next();
                        if (ffkj.e(((ResolvedRecipient) next).g(), recipient2.g())) {
                            resolvedRecipient2 = next;
                            break;
                        }
                    }
                    resolvedRecipient2 = resolvedRecipient2;
                }
                cyvh.this.c(resolvedRecipient2);
                return ffcu.a;
            }
        }, 3);
    }

    public final void c(ResolvedRecipient resolvedRecipient) {
        cyxs cyxsVar = (cyxs) this.h.b();
        cyxsVar.b.f(resolvedRecipient);
        cyxsVar.a.f(czaj.c);
        cyxsVar.c.f(false);
    }
}
