package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avyx extends ffhv implements ffjm {
    final /* synthetic */ avzh a;
    final /* synthetic */ awap b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avyx(ffgu ffguVar, avzh avzhVar, awap awapVar) {
        super(2, ffguVar);
        this.a = avzhVar;
        this.b = awapVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avyx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        MessagePartData e;
        ffci.b(obj);
        bdmq bdmqVar = (bdmq) this.a.d.b();
        ekzz f = eleg.f("MessageDatabaseOperations#readMessageAndParts-processingId");
        final awap awapVar = this.b;
        try {
            efbd.b();
            bdpt bdptVar = (bdpt) bdmqVar.f.b();
            ekzz f2 = eleg.f("MessagePartDatabaseOperations#readMessagePartData-processingId");
            try {
                bwdf c = PartsTable.c();
                c.z("readMessagePartData-processingId");
                c.r();
                c.h(new Function() { // from class: bdpp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bwdm bwdmVar = (bwdm) obj2;
                        int intValue = PartsTable.e().intValue();
                        if (intValue < 60080) {
                            dtub.w("processing_id", intValue);
                        }
                        bwdmVar.aq(new dtrt("parts.processing_id", 1, awao.b(awap.this)));
                        return bwdmVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                Optional max = Collection.EL.stream(c.b().y()).max(Comparator.CC.comparing(new Function() { // from class: bdpq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((PartsTable.BindData) obj2).J();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                MessageCoreData messageCoreData = null;
                if (max.isEmpty()) {
                    f2.close();
                    e = null;
                } else {
                    e = ((bcwz) bdptVar.a.b()).e((PartsTable.BindData) max.get());
                    f2.close();
                }
                if (e == null) {
                    enrr k = bdmq.a.k();
                    k.Y(cqpo.j, awapVar);
                    ((enrr) k.h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageDatabaseOperations", "readMessageAndParts", 205, "MessageDatabaseOperations.java")).q("Message part not found for processingId.");
                } else {
                    MessageCoreData z = bdmqVar.z(e.B());
                    if (z == null) {
                        enrr k2 = bdmq.a.k();
                        k2.Y(cqpo.j, awapVar);
                        ((enrr) k2.h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageDatabaseOperations", "readMessageAndParts", 213, "MessageDatabaseOperations.java")).q("Message not found for part with processingId.");
                    } else {
                        z.aL(e);
                        messageCoreData = z;
                    }
                }
                f.close();
                return messageCoreData;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avyx avyxVar = new avyx(ffguVar, this.a, this.b);
        avyxVar.c = obj;
        return avyxVar;
    }
}
