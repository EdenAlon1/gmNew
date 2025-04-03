package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aigc extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ aigd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aigc(aigd aigdVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = aigdVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dosl doskVar;
        ffci.b(obj);
        Object obj2 = this.a;
        ?? r2 = this.b;
        Object obj3 = this.c;
        boolean z = this.d;
        List b = z ? ffel.a : ffdx.b(this.e.f);
        dlsr b2 = this.e.b();
        if (z) {
            final aigd aigdVar = this.e;
            final aidv aidvVar = (aidv) obj3;
            doskVar = new dosi((String) obj2, aigdVar.a.getString(R.string.search_hint_empty), true, new aigb(aigdVar.c), new ffix() { // from class: aifz
                @Override // defpackage.ffix
                public final Object invoke() {
                    aidv aidvVar2 = aidv.this;
                    if (!aidvVar2.b.isEmpty()) {
                        dngx dngxVar = ((aiex) aidvVar2.b.get(0)).a().a;
                        if (!(dngxVar instanceof dngv)) {
                            throw new IllegalArgumentException("Unexpected ListItemUiData when clicking on Done button");
                        }
                        dngv dngvVar = (dngv) dngxVar;
                        if (!dngvVar.d) {
                            aigd aigdVar2 = aigdVar;
                            dngvVar.f.invoke();
                            aigdVar2.e.f(false);
                        }
                    }
                    return ffcu.a;
                }
            });
        } else {
            String string = this.e.a.getString(R.string.multi_share_top_app_bar_title);
            string.getClass();
            doskVar = new dosk(string, null, null, false, null, null, null, 254);
        }
        return new aigf(new dotb(doskVar, b2, b, false, false, null, null, 112), (aidv) obj3, r2, new aige(null));
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        aigc aigcVar = new aigc(this.e, (ffgu) obj5);
        aigcVar.a = (String) obj;
        aigcVar.b = (List) obj2;
        aigcVar.c = (aidv) obj3;
        aigcVar.d = booleanValue;
        return aigcVar.b(ffcu.a);
    }
}
