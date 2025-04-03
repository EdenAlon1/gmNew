package defpackage;

import android.content.Context;
import android.webkit.URLUtil;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzb {
    private static final cfup j = cfvl.j(cfvl.b, "emotify_badge_scale", 1.3f);
    public final ffsk a;
    public final alye b;
    public final ffbr c;
    public final zzw d;
    public final ajjc e;
    public final abak f;
    public final abbv g;
    public final ffbr h;
    public final ffbr i;
    private final Context k;
    private final Map l;
    private final aufx m;
    private final avai n;

    public zzb(Context context, ffsk ffskVar, alye alyeVar, ffbr ffbrVar, zzw zzwVar, ajjc ajjcVar, Map map, abak abakVar, abbv abbvVar, ffbr ffbrVar2, ffbr ffbrVar3, aufx aufxVar, avai avaiVar) {
        context.getClass();
        ffskVar.getClass();
        alyeVar.getClass();
        ajjcVar.getClass();
        abakVar.getClass();
        abbvVar.getClass();
        ffbrVar2.getClass();
        this.k = context;
        this.a = ffskVar;
        this.b = alyeVar;
        this.c = ffbrVar;
        this.d = zzwVar;
        this.e = ajjcVar;
        this.l = map;
        this.f = abakVar;
        this.g = abbvVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.m = aufxVar;
        this.n = avaiVar;
    }

    private final String c(String str, int i) {
        String quantityString = this.k.getResources().getQuantityString(R.plurals.reaction_badges_content_description, i, Integer.valueOf(i), str);
        quantityString.getClass();
        return quantityString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [dlti] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [dlti] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [dlti] */
    /* JADX WARN: Type inference failed for: r13v8 */
    public final dmcg a(final alxr alxrVar, dmci dmciVar, Float f) {
        dmci dmciVar2;
        dmcg dmcgVar;
        int i;
        ArrayList arrayList;
        dmba dmawVar;
        int i2;
        alxrVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        apyd i3 = alxrVar.i();
        int i4 = 2;
        if (i3 == null || i3.d().isEmpty()) {
            dmciVar2 = dmciVar;
            dmcgVar = null;
        } else {
            final Long p = alxrVar.p();
            final engw d = i3.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            enqv it = d.iterator();
            it.getClass();
            while (it.hasNext()) {
                apya apyaVar = (apya) it.next();
                int i5 = apyaVar.b;
                Integer num = (Integer) linkedHashMap.get(apyaVar.a);
                linkedHashMap.put(apyaVar.a, Integer.valueOf((num != null ? num.intValue() : 0) + i5));
            }
            List<Map.Entry> ai = ffdx.ai(linkedHashMap.entrySet(), 5);
            int size = linkedHashMap.size() - 5;
            char c = '\n';
            ArrayList arrayList3 = new ArrayList(ffdx.n(ai, 10));
            for (Map.Entry entry : ai) {
                apyv apyvVar = (apyv) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                if (apyvVar instanceof apxx) {
                    apxx apxxVar = (apxx) apyvVar;
                    aagm aagmVar = (aagm) this.l.get(apxxVar.a);
                    if (aagmVar != null) {
                        String string = this.k.getString(aagmVar.b);
                        string.getClass();
                        arrayList = arrayList3;
                        dmawVar = new dmat(aagmVar.a, aagmVar.c, intValue, c(string, intValue), dmciVar);
                    } else {
                        arrayList = arrayList3;
                        String str = apxxVar.a;
                        dmawVar = new dmav(str, intValue, c(str, intValue), dmciVar);
                    }
                    i2 = size;
                } else {
                    arrayList = arrayList3;
                    if (!(apyvVar instanceof apyb)) {
                        throw new ffcd();
                    }
                    apyb apybVar = (apyb) apyvVar;
                    String a = apybVar.a();
                    String b = apybVar.b();
                    Float f2 = f == null ? (Float) j.e() : f;
                    f2.getClass();
                    Context context = this.k;
                    float floatValue = f2.floatValue();
                    String quantityString = context.getResources().getQuantityString(R.plurals.reaction_badges_content_description, intValue, Integer.valueOf(intValue), this.k.getResources().getString(R.string.emotify_badge_title));
                    quantityString.getClass();
                    i2 = size;
                    dmawVar = new dmaw(a, b, floatValue, intValue, quantityString, dmciVar);
                }
                arrayList.add(dmawVar);
                arrayList3 = arrayList;
                size = i2;
                c = '\n';
            }
            dmciVar2 = dmciVar;
            int i6 = size;
            dmcgVar = null;
            List am = ffdx.am(arrayList3);
            if (i6 > 0) {
                int i7 = i6 < 10 ? R.string.truncated_reaction_badges_text_less_than_ten : R.string.truncated_reaction_badges_text_more_than_nine;
                Context context2 = this.k;
                Integer valueOf = Integer.valueOf(i6);
                String string2 = context2.getString(i7, valueOf);
                string2.getClass();
                String string3 = this.k.getString(R.string.truncated_reaction_badges_content_description, valueOf);
                string3.getClass();
                ffdx.w(am, ffdx.b(new dmaz(string2, string3, dmciVar2)));
            }
            arrayList2.add(new dmas(am, this.m.a() ? abjk.a : null, new ffix() { // from class: zyw
                @Override // defpackage.ffix
                public final Object invoke() {
                    dnid dnicVar;
                    String str2;
                    final zzb zzbVar = zzb.this;
                    final Long l = p;
                    zzbVar.g.e(2, 4, l);
                    ArrayList<apya> arrayList4 = new ArrayList();
                    for (Object obj : d) {
                        apyv apyvVar2 = ((apya) obj).a;
                        if ((apyvVar2 instanceof apxx) || ((apyvVar2 instanceof apyb) && ctjd.d())) {
                            arrayList4.add(obj);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(ffdx.n(arrayList4, 10));
                    for (apya apyaVar2 : arrayList4) {
                        engw<apxz> engwVar = apyaVar2.d;
                        ArrayList arrayList6 = new ArrayList(ffdx.n(engwVar, 10));
                        for (apxz apxzVar : engwVar) {
                            dnwn a2 = ((crpw) zzbVar.c.b()).a(apxzVar.b, true);
                            String a3 = aswb.a() ? cuxh.a(apxzVar.a) : apxzVar.a;
                            a3.getClass();
                            String str3 = null;
                            if (((asum) zzbVar.h.b()).a() && (str2 = apxzVar.e) != null) {
                                str3 = str2;
                            }
                            apyv apyvVar3 = apyaVar2.a;
                            if (apyvVar3 instanceof apxx) {
                                dnicVar = new dnib(((apxx) apyvVar3).a);
                            } else {
                                if (!(apyvVar3 instanceof apyb)) {
                                    throw new ffcd();
                                }
                                String b2 = ((apyb) apyvVar3).b();
                                if (!URLUtil.isValidUrl(b2)) {
                                    throw new IllegalStateException(a.a(b2, "Invalid Uri for Emotify:", " "));
                                }
                                dnicVar = new dnic(b2);
                            }
                            arrayList6.add(new dnir(a2, a3, dnicVar, str3));
                        }
                        arrayList5.add(arrayList6);
                    }
                    zzbVar.e.a(new abhr(ffdx.o(arrayList5), new ffix() { // from class: zyu
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            zzb.this.g.e(3, 4, l);
                            return ffcu.a;
                        }
                    }));
                    return ffcu.a;
                }
            }, new ffix() { // from class: zyx
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ffix
                public final Object invoke() {
                    Iterator it2 = d.iterator();
                    while (it2.hasNext()) {
                        enqv it3 = ((apya) it2.next()).d.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            fjay fjayVar = ((apxz) it3.next()).d;
                            if (fjayVar != null) {
                                abak abakVar = this.f;
                                if (ffkj.e(abakVar.c, fjayVar)) {
                                    abakVar.b.g(abak.a, null, null, ecrh.SUCCESS);
                                    abakVar.c = null;
                                }
                            }
                        }
                    }
                    return ffcu.a;
                }
            }, new dmar(this.n.a()), 2));
        }
        if (alxrVar.y()) {
            arrayList2.add(new dmas(ffdx.b(new dmay(this.k.getString(R.string.star_badges_content_description), dmciVar2, 1)), this.m.a() ? abjk.a : dmcgVar, new ffix() { // from class: zyy
                @Override // defpackage.ffix
                public final Object invoke() {
                    zzb zzbVar = zzb.this;
                    axol.k(zzbVar.a, null, new zza(zzbVar, alxrVar, null), 3);
                    return ffcu.a;
                }
            }, null, new dmar(this.n.a()), 18));
        }
        final aqdr z = alxrVar.z();
        if (z != null) {
            arrayList2.add(new dmas(ffdx.b(new dmau(this.k.getString(R.string.calendar_badge_content_description), dmciVar2, 1)), this.m.a() ? abjk.a : dmcgVar, new ffix() { // from class: zyt
                @Override // defpackage.ffix
                public final Object invoke() {
                    zzb zzbVar = zzb.this;
                    axol.m(zzbVar.a, new zyz(zzbVar, z, null));
                    return ffcu.a;
                }
            }, null, new dmar(this.n.a()), 18));
        }
        if (alxrVar instanceof alyv) {
            final alyv alyvVar = (alyv) alxrVar;
            i = 1;
            arrayList2.add(new dmas(ffdx.b(new dmax(this.k.getString(R.string.scheduled_send_badges_content_description), dmciVar2, 1)), this.m.a() ? abjk.a : dmcgVar, new ffix() { // from class: zyv
                @Override // defpackage.ffix
                public final Object invoke() {
                    zzb.this.d.c(alyvVar);
                    return ffcu.a;
                }
            }, null, new dmar(this.n.a()), 18));
        } else {
            i = 1;
        }
        if (alxrVar.h() == null) {
            i4 = i;
        } else if (!zsr.q(alxrVar)) {
            i4 = 3;
        }
        return !arrayList2.isEmpty() ? new dmcg(arrayList2, i4) : dmcgVar;
    }
}
