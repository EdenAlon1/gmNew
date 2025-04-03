package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjiy {
    public static final void a(buxr buxrVar, final MessageIdType messageIdType) {
        buxrVar.Y(new Function() { // from class: cjix
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.q(MessageIdType.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxrVar.ak();
        buxrVar.b().e();
    }

    public static final buxr b() {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("failedUpdateBuilder");
        buxrVar.U(8);
        buxrVar.B(10001);
        return buxrVar;
    }

    public static final engw c(drud drudVar) {
        buxo d = MessagesTable.d();
        d.z("+updatePhotosSharingState");
        buxz buxzVar = new buxz();
        buxzVar.af(10);
        d.g(buxzVar);
        d.d(new buxl(MessagesTable.c.i, false));
        d.c(MessagesTable.c.a);
        String[] strArr = bucb.a;
        bubw bubwVar = new bubw(bucb.a);
        bubwVar.z("photosSharingTableQuery");
        buca bucaVar = new buca();
        bucaVar.aq(new dtru("message_photos_sharing.sharing_state", 1, new dtzq("$R", new Object[]{dtub.i(cjie.a.b(drudVar).toByteArray())})));
        bubwVar.k(new bubz(bucaVar));
        d.D(dtvz.i(bubwVar.b(), bucb.b.a, MessagesTable.c.a).g());
        d.v(MessagesTable.c.a);
        return d.b().g();
    }

    public static final buby d(cjia cjiaVar) {
        String[] strArr = bucb.a;
        buby bubyVar = new buby();
        bubyVar.ap("updatePhotosSharingState");
        if (cjiaVar == null) {
            bubyVar.a.putNull("sharing_state");
            return bubyVar;
        }
        bubyVar.a.put("sharing_state", cjiaVar.toByteArray());
        return bubyVar;
    }

    public static final buxr e() {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("yetToSendUpdateBuilder");
        buxrVar.U(4);
        buxz buxzVar = new buxz();
        buxzVar.af(10);
        bwdf c = PartsTable.c();
        c.f(new Function() { // from class: cjiv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bwat) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c.h(new Function() { // from class: cjiw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                bwdmVar.b(new Function() { // from class: cjit
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bwdm bwdmVar2 = (bwdm) obj2;
                        bwdmVar2.s();
                        return bwdmVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: cjiu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bwdm bwdmVar2 = (bwdm) obj2;
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
        buxrVar.af(new buxs(buxzVar));
        return buxrVar;
    }
}
