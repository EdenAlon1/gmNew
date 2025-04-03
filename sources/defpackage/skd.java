package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skd extends ffhv implements ffjm {
    final /* synthetic */ skf a;
    final /* synthetic */ aree b;
    final /* synthetic */ ardn c;
    final /* synthetic */ Locale d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skd(ffgu ffguVar, skf skfVar, aree areeVar, ardn ardnVar, Locale locale) {
        super(2, ffguVar);
        this.a = skfVar;
        this.b = areeVar;
        this.c = ardnVar;
        this.d = locale;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((skd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object apply;
        ffci.b(obj);
        String[] strArr = VmtTable.a;
        byxl byxlVar = new byxl();
        byxlVar.c(this.b.c);
        byxlVar.e(this.c);
        byxlVar.b(this.d.toLanguageTag());
        final VmtTable.BindData a = byxlVar.a();
        apply = new ske(this.b).apply(new byyk());
        final byyj byyjVar = new byyj((byyk) apply);
        final dtve b = VmtTable.b();
        ((Boolean) b.q(new emyl() { // from class: byxh
            @Override // defpackage.emyl
            public final Object get() {
                String[] strArr2 = VmtTable.a;
                byyi byyiVar = new byyi();
                ContentValues contentValues = byyiVar.a;
                VmtTable.BindData bindData = VmtTable.BindData.this;
                dtub.u(contentValues, "part_id", bindData.m());
                byyiVar.d(bindData.k());
                byyiVar.c(bindData.n());
                dtub.u(byyiVar.a, "locale", bindData.l());
                byyiVar.al();
                byyiVar.af(byyjVar);
                byyiVar.an(new dtui("vmt", "-updateOrInsert-update"));
                if (byyiVar.b().e() != 0) {
                    return true;
                }
                final dtve dtveVar = b;
                return Boolean.valueOf(dtub.b(VmtTable.b(), "vmt", bindData, new Function() { // from class: byxf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Long.valueOf(dtve.this.R("vmt", (ContentValues) obj2));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: byxg
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }) != -1);
            }
        })).booleanValue();
        cbgf cbgfVar = this.a.f;
        aree areeVar = this.b;
        cbgfVar.l(areeVar.a, areeVar.b, new String[0]);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        skd skdVar = new skd(ffguVar, this.a, this.b, this.c, this.d);
        skdVar.e = obj;
        return skdVar;
    }
}
