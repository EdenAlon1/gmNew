package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcne {
    public static final ffbr a = new ffbr() { // from class: bcnd
        @Override // defpackage.ffbr, defpackage.ffbq
        public final Object b() {
            Object apply;
            String[] strArr = bbrx.a;
            bbru bbruVar = new bbru(bbrx.a);
            bbruVar.u();
            apply = new Function() { // from class: bcnc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bbrw bbrwVar = (bbrw) obj;
                    bbrwVar.aq(new dtrx("message_captions_backup.caption", 6));
                    return bbrwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new bbrw());
            bbruVar.k(new bbrv((bbrw) apply));
            bbruVar.n(new dtzq("$V", new Object[]{bbrx.c.a}), "backup_id");
            bbruVar.n(new dtzq("$V{J:bugle_message_captions}", new Object[]{btul.c.a}), "bugle_id");
            bbru bbruVar2 = (bbru) bbruVar.j(bcjs.c(bbrx.c.a, bckf.b, "message_captions_id_map", false, 16));
            btui btuiVar = new btui(btul.a);
            btuiVar.u();
            dtvy h = dtvz.h(btuiVar.a());
            String[] strArr2 = bqea.a;
            bqdz bqdzVar = new bqdz();
            bqdzVar.as(new dtzq("$V{J:bugle_message_captions} = $V{J:message_captions_id_map}", new Object[]{btul.c.a, bqea.c.d}));
            bqdy bqdyVar = new bqdy(bqdzVar);
            dtrd dtrdVar = (dtrd) h;
            dtrdVar.d = bqdyVar;
            dtrdVar.e = "bugle_message_captions";
            return ffdx.b((bbru) bbruVar2.j(h));
        }
    };
}
