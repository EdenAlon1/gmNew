package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emoi implements emnk {
    private final emie a;
    private final enip b = enip.v("/collection/athletes", "/collection/films", "/collection/film_series", "/collection/musical_groups", "/collection/music_group_members", "/collection/musicians", "/collection/restaurants", "/collection/sports_teams", "/collection/tv_episodes", "/collection/tv_programs", "/collection/bakeries", "/collection/cafes_and_coffee_shops", "/collection/ice_cream_parlors");

    public emoi(emie emieVar) {
        this.a = emieVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.emnk
    public final engw a(fbup fbupVar, String str, emrk emrkVar) {
        emxc emxcVar;
        eygr eygrVar = fbupVar.b;
        ArrayList<emoj> arrayList = new ArrayList();
        if (!eygrVar.isEmpty()) {
            enip enipVar = this.b;
            if (!enipVar.isEmpty()) {
                fbun fbunVar = (fbun) eygrVar.get(eygrVar.size() - 1);
                String str2 = fbunVar.b == 30 ? (String) fbunVar.c : "";
                if (!str2.isEmpty()) {
                    arrayList.add(new emoj(str2, null, null, 0, 0));
                    for (fbuk fbukVar : fbunVar.f) {
                        fbqt b = fbqt.b(fbukVar.e);
                        if (b == null) {
                            b = fbqt.UNRECOGNIZED;
                        }
                        if (b == fbqt.WEBREF_ANNOTATION) {
                            String str3 = (fbukVar.c == 9 ? (fbxy) fbukVar.d : fbxy.a).c;
                            if (enipVar.contains(str3)) {
                                arrayList.add(new emoj(str2, str3, (fbukVar.c == 9 ? (fbxy) fbukVar.d : fbxy.a).d, fbukVar.h, fbukVar.i));
                            }
                        }
                    }
                }
            }
        }
        int i = engw.d;
        engr engrVar = new engr();
        for (emoj emojVar : arrayList) {
            String str4 = emojVar.a;
            Iterator<E> it = this.a.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    emxcVar = emux.a;
                    break;
                }
                emig emigVar = (emig) it.next();
                Iterator<E> it2 = emigVar.d.iterator();
                while (it2.hasNext()) {
                    if (str4.matches((String) it2.next())) {
                        engw engwVar = enou.a;
                        if (emojVar.a()) {
                            String str5 = emojVar.b;
                            emng h = emnh.h();
                            h.f(str5);
                            h.e(emojVar.c);
                            engwVar = engw.r(h.a());
                        }
                        emni f = emnj.f();
                        f.c(emigVar.b == 2 ? (String) emigVar.c : "");
                        f.b(engwVar);
                        f.d(1.0E-6f);
                        f.e(fbrg.REGEXP);
                        emxcVar = emxc.j(f.a());
                    }
                }
            }
            if (emxcVar.g() && !((emnf) emxcVar.c()).a.isEmpty()) {
                engrVar.h(emxcVar.c());
            }
        }
        return engrVar.g();
    }

    @Override // defpackage.emnk
    public final /* synthetic */ void b() {
    }
}
