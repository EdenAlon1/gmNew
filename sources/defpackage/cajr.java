package defpackage;

import com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cajr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqux b;
    final /* synthetic */ cakc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cajr(ffgu ffguVar, aqux aquxVar, cakc cakcVar) {
        super(2, ffguVar);
        this.b = aquxVar;
        this.c = cakcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cajr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            Optional m = this.b.m();
            final cajt cajtVar = cajt.a;
            String str = ((awui) m.flatMap(new Function() { // from class: cakb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj2) {
                    return ffji.this.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElseThrow()).d;
            str.getClass();
            elfl e = ((bzqc) this.c.d.b()).e(str);
            e.getClass();
            this.a = 1;
            obj = fgfz.c(e, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Boolean bool = (Boolean) obj;
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        fffs fffsVar = new fffs((byte[]) null);
        if (booleanValue) {
            fffsVar.add(capm.b);
            if (bzwf.g()) {
                fffsVar.add(capm.c);
            }
        } else {
            fffsVar.add(capm.a);
        }
        return new E2eeInfo(ffdx.a(fffsVar));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cajr cajrVar = new cajr(ffguVar, this.b, this.c);
        cajrVar.d = obj;
        return cajrVar;
    }
}
