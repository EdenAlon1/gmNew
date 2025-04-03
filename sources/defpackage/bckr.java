package defpackage;

import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bckr implements bcjn {
    public static final bckr a = new bckr();

    private bckr() {
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtry a() {
        return bbke.c.a;
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx b() {
        Object apply;
        bbkb a2 = bbke.a();
        a2.z("BackupConversationParticipantsTable.QueryBuilder");
        apply = new Function() { // from class: bckq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply2;
                bbkd bbkdVar = (bbkd) obj;
                Function[] functionArr = {new Function() { // from class: bcko
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bbkd bbkdVar2 = (bbkd) obj2;
                        int intValue = bbke.c().intValue();
                        if (intValue < 70) {
                            dtub.w("is_c2p_only", intValue);
                        }
                        bbkdVar2.aq(new dtrx("conversation_participants_backup.is_c2p_only", 5));
                        return bbkdVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bckp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bbkd bbkdVar2 = (bbkd) obj2;
                        int intValue = bbke.c().intValue();
                        if (intValue < 70) {
                            dtub.w("is_c2p_only", intValue);
                        }
                        bbkdVar2.aq(new dtwe("conversation_participants_backup.is_c2p_only", 1, 0));
                        return bbkdVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }};
                bbkd[] bbkdVarArr = new bbkd[2];
                for (int i = 0; i < 2; i++) {
                    Function function = functionArr[i];
                    String[] strArr = bbke.a;
                    apply2 = function.apply(new bbkd());
                    bbkdVarArr[i] = (bbkd) apply2;
                }
                bbkdVar.ar(bbkdVarArr);
                return bbkdVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bbkd());
        a2.k(new bbkc((bbkd) apply));
        return a2;
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx c(dtyx dtyxVar, List list) {
        bbkb bbkbVar = (bbkb) dtyxVar;
        bbjl[] bbjlVarArr = (bbjl[]) list.toArray(new bbjl[0]);
        bbkbVar.c((bbjl[]) Arrays.copyOf(bbjlVarArr, bbjlVarArr.length));
        return bbkbVar;
    }
}
