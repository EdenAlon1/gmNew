package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhr implements cwhi {
    public final ffsk a;
    public final cwiw b;
    public final ajjc c;
    private final Context d;
    private final aqvh e;
    private final ctwb f;
    private final cwis g;
    private final ffxx h;

    public cwhr(Context context, ffsk ffskVar, cwiw cwiwVar, aqvh aqvhVar, ctwb ctwbVar, ajjc ajjcVar, cwis cwisVar) {
        context.getClass();
        ffskVar.getClass();
        cwiwVar.getClass();
        aqvhVar.getClass();
        ctwbVar.getClass();
        ajjcVar.getClass();
        cwisVar.getClass();
        this.d = context;
        this.a = ffskVar;
        this.b = cwiwVar;
        this.e = aqvhVar;
        this.f = ctwbVar;
        this.c = ajjcVar;
        this.g = cwisVar;
        fgdj a = cwiwVar.a();
        aqge a2 = aqvhVar.a();
        a2.getClass();
        this.h = fgck.a(a, aqfu.a(a2), cwisVar.a(), new cwhq(this, null));
    }

    @Override // defpackage.cwhi
    public final ffxx a() {
        return this.h;
    }

    public final dmvi b(engw engwVar, aqux aquxVar, final ajiy ajiyVar, final fgcm fgcmVar) {
        String string = this.d.getString(R.string.sim_selector_dialog_title);
        string.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            final aqux aquxVar2 = (aqux) it.next();
            aquxVar2.getClass();
            arrayList.add(new dnjs(c(aquxVar2), aquxVar2.o(), aquxVar2.n(), ffkj.e(aquxVar2, aquxVar), aquxVar2.u(), new ffix() { // from class: cwhj
                @Override // defpackage.ffix
                public final Object invoke() {
                    aqux aquxVar3;
                    fgcm fgcmVar2;
                    Object c;
                    do {
                        aquxVar3 = aquxVar2;
                        fgcmVar2 = fgcm.this;
                        c = fgcmVar2.c();
                    } while (!fgcmVar2.g(c, aquxVar3));
                    return ffcu.a;
                }
            }));
        }
        String string2 = this.d.getString(R.string.sim_selector_dialog_confirm);
        string2.getClass();
        doas doasVar = new doas(string2, new ffix() { // from class: cwhk
            @Override // defpackage.ffix
            public final Object invoke() {
                ajiy.this.a();
                this.b.d((aqux) fgcmVar.c());
                return ffcu.a;
            }
        });
        String string3 = this.d.getString(R.string.sim_selector_dialog_dismiss);
        string3.getClass();
        return new dmvi(string, arrayList, null, null, doasVar, new doas(string3, new ffix() { // from class: cwhl
            @Override // defpackage.ffix
            public final Object invoke() {
                ajiy.this.a();
                return ffcu.a;
            }
        }), null, 76);
    }

    public final doie c(aqux aquxVar) {
        return new doie(ffol.c(this.f.h(aquxVar.b()).d() + 1), aquxVar.a() == 0 ? this.d.getColor(R.color.sim_icon_text_color) : doxi.a(this.d, aquxVar.a()));
    }
}
