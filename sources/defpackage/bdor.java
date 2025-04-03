package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdor {
    public static final /* synthetic */ int a = 0;
    private static final buxs b;
    private final cbgf c;
    private final ffbr d;

    static {
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.af(10);
        bwdf c = PartsTable.c();
        c.z("PROCESSING_COMPLETE_YET_TO_SEND");
        c.f(new Function() { // from class: bdon
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = bdor.a;
                return ((bwat) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c.h(new Function() { // from class: bdoo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                int i = bdor.a;
                bwdmVar.b(new Function() { // from class: bdop
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bwdm bwdmVar2 = (bwdm) obj2;
                        int i2 = bdor.a;
                        bwdmVar2.s();
                        return bwdmVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bdoq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bwdm bwdmVar2 = (bwdm) obj2;
                        int i2 = bdor.a;
                        bwdmVar2.t(byzc.SUCCEEDED);
                        return bwdmVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxzVar.y(c.b());
        b = new buxs(buxzVar);
    }

    public bdor(cbgf cbgfVar, ffbr ffbrVar) {
        this.c = cbgfVar;
        this.d = ffbrVar;
    }

    public final int a() {
        boolean booleanValue = ((Boolean) cjja.a.e()).booleanValue();
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.af(10);
        bwdf c = PartsTable.c();
        c.z("buildWhereProcessedMessageHasFailedParts");
        c.f(new Function() { // from class: bdom
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = bdor.a;
                return ((bwat) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.h(byzc.SUCCEEDED);
        if (booleanValue) {
            engrVar.h(byzc.PENDING);
        }
        bwdm bwdmVar = new bwdm();
        engw g = engrVar.g();
        int intValue = PartsTable.e().intValue();
        if (intValue < 4020) {
            dtub.w("processing_status", intValue);
        }
        bwdmVar.aq(new dtrw("parts.processing_status", 4, bwdm.at((Iterable) enqc.a(g).map(new Function() { // from class: bwdl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((byzc) obj).ordinal());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bwdk
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }))), true));
        c.k(new bwdj(bwdmVar));
        buxzVar.t(c.b());
        buxs buxsVar = new buxs(buxzVar);
        amdh amdhVar = (amdh) this.d.b();
        buxo d = MessagesTable.d();
        d.z("promoteProcessedMessages-messages1");
        d.r();
        d.k(buxsVar);
        engw g2 = d.b().g();
        amep e = ameq.e();
        ((amcu) e).a = Optional.of(10001);
        e.b(epdh.ATTACHMENT_PROCESS_FAILED);
        amdhVar.e(g2, e.a());
        buxs buxsVar2 = b;
        buxr buxrVar = new buxr();
        buxrVar.ap("promoteProcessedMessages-messages2");
        buxrVar.U(4);
        buxo d2 = MessagesTable.d();
        d2.z("+notifyAboutMessagesChangeAndUpdate");
        d2.r();
        d2.k(buxsVar2);
        buuo buuoVar = (buuo) d2.b().o();
        while (buuoVar.moveToNext()) {
            try {
                this.c.l(buuoVar.p(), buuoVar.q(), "message_status");
            } catch (Throwable th) {
                try {
                    buuoVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        buuoVar.close();
        buxrVar.af(buxsVar2);
        buxrVar.ak();
        return buxrVar.b().e();
    }
}
