package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cudg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cudh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cudg(ffgu ffguVar, cudh cudhVar) {
        super(2, ffguVar);
        this.b = cudhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cudg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        emhv emhvVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a == 0) {
            ffci.b(obj);
            cfup cfupVar = cude.a;
            String str = (String) cude.d.e();
            if (str != null && str.length() != 0) {
                cuct cuctVar = (cuct) this.b.g.get();
                if (!ffkj.e(cuctVar != null ? cuctVar.e() : null, str)) {
                    cudh cudhVar = this.b;
                    this.a = 1;
                    emmt emmtVar = (emmt) cudhVar.d.b();
                    Object e = cude.c.e();
                    e.getClass();
                    if (((CharSequence) e).length() > 0) {
                        emhu emhuVar = (emhu) emhv.a.createBuilder();
                        String str2 = (String) cude.c.e();
                        emhuVar.copyOnWrite();
                        emhv emhvVar2 = (emhv) emhuVar.instance;
                        str2.getClass();
                        emhvVar2.b |= 2;
                        emhvVar2.d = str2;
                        eyfy build = emhuVar.build();
                        build.getClass();
                        emhvVar = (emhv) build;
                    } else {
                        emhu emhuVar2 = (emhu) emhv.a.createBuilder();
                        emhw emhwVar = (emhw) emhx.a.createBuilder();
                        String str3 = (String) cude.b.e();
                        emhwVar.copyOnWrite();
                        emhx emhxVar = (emhx) emhwVar.instance;
                        str3.getClass();
                        emhxVar.b |= 1;
                        emhxVar.c = str3;
                        String str4 = (String) cude.a.e();
                        emhwVar.copyOnWrite();
                        emhx emhxVar2 = (emhx) emhwVar.instance;
                        str4.getClass();
                        emhxVar2.b |= 2;
                        emhxVar2.d = str4;
                        emhuVar2.copyOnWrite();
                        emhv emhvVar3 = (emhv) emhuVar2.instance;
                        emhx emhxVar3 = (emhx) emhwVar.build();
                        emhxVar3.getClass();
                        emhvVar3.c = emhxVar3;
                        emhvVar3.b = 1 | emhvVar3.b;
                        eyfy build2 = emhuVar2.build();
                        build2.getClass();
                        emhvVar = (emhv) build2;
                    }
                    erph c = emmtVar.c(emhvVar);
                    final ffjm ffjmVar = new ffjm() { // from class: cuda
                        @Override // defpackage.ffjm
                        public final Object a(Object obj2, Object obj3) {
                            InputStream inputStream = (InputStream) obj3;
                            ffbz ffbzVar = cudh.a;
                            if (inputStream == null) {
                                return null;
                            }
                            return (cucv) eyfy.parseFrom(cucv.a, inputStream, eyfc.a());
                        }
                    };
                    erqc g = c.e(new erow() { // from class: cudb
                        @Override // defpackage.erow
                        public final Object a(erpc erpcVar, Object obj2) {
                            ffbz ffbzVar = cudh.a;
                            return ffjm.this.a(erpcVar, obj2);
                        }
                    }, (Executor) cudhVar.f.b()).g();
                    final ffji ffjiVar = new ffji() { // from class: cudc
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            ffbz ffbzVar = cudh.a;
                            csjb e2 = cudf.a().e();
                            e2.I("Could not parse input stream");
                            e2.s((IOException) obj2);
                            return null;
                        }
                    };
                    obj = fgfz.c(ernq.f(g, IOException.class, new emwl() { // from class: cudd
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            ffbz ffbzVar = cudh.a;
                            ffji.this.invoke(obj2);
                            return null;
                        }
                    }, (Executor) cudhVar.e.b()), this);
                    if (obj == ffhhVar) {
                        return ffhhVar;
                    }
                }
            }
            return ffcu.a;
        }
        ffci.b(obj);
        cucv cucvVar = (cucv) obj;
        if (cucvVar != null) {
            cudh cudhVar2 = this.b;
            cfup cfupVar2 = cude.a;
            if (ffkj.e((String) cude.d.e(), cucvVar.d)) {
                cuct cuctVar2 = (cuct) cudhVar2.g.get();
                if (!ffkj.e(cuctVar2 != null ? cuctVar2.e() : null, cucvVar.d)) {
                    cudhVar2.g.set(new cuct(cucvVar));
                }
            } else {
                cudf.a().r("The new configuration's id doesn't match the target id.");
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cudg cudgVar = new cudg(ffguVar, this.b);
        cudgVar.c = obj;
        return cudgVar;
    }
}
