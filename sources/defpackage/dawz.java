package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.debug.LoadReactionsReceiver;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawz extends ffhv implements ffjm {
    final /* synthetic */ LoadReactionsReceiver a;
    final /* synthetic */ Iterator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dawz(LoadReactionsReceiver loadReactionsReceiver, Iterator it, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = loadReactionsReceiver;
        this.b = it;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dawz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        fazb fazbVar;
        ffbr ffbrVar;
        ffci.b(obj);
        do {
            fazbVar = this.a.d;
            ffbrVar = null;
            if (fazbVar == null) {
                ffkj.c("syncManager");
                fazbVar = null;
            }
        } while (((coxg) fazbVar.b()).v());
        ffbr ffbrVar2 = this.a.e;
        if (ffbrVar2 == null) {
            ffkj.c("transactionManager");
        } else {
            ffbrVar = ffbrVar2;
        }
        dtuu dtuuVar = (dtuu) ffbrVar.b();
        final Iterator it = this.b;
        dtuuVar.d("LoadReactionsReceiver#transaction", new Runnable() { // from class: dawx
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = bueg.a;
                budw budwVar = new budw();
                budwVar.f("LoadReactionsReceiver#processBroadcast.delete");
                budwVar.e();
                budwVar.d();
                buxo d = MessagesTable.d();
                d.z("LoadReactionsReceiver.processBroadcast");
                d.e(new Function() { // from class: dawy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return new buun[]{((buum) obj2).a};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d.d(new buxl(MessagesTable.c.i, false));
                buuo buuoVar = (buuo) d.b().o();
                while (buuoVar.moveToNext()) {
                    Iterator it2 = it;
                    if (!it2.hasNext()) {
                        break;
                    }
                    List<String> V = ffpc.V((String) it2.next(), new String[]{","}, 50, 2);
                    if (!V.isEmpty() && ((CharSequence) V.get(0)).length() != 0) {
                        MessageIdType D = ((MessagesTable.BindData) buuoVar.cO()).D();
                        D.getClass();
                        LoadReactionsReceiver.a.p("Trying to insert reactions to message id " + D + ", size: " + V.size());
                        buct buctVar = new buct();
                        buctVar.e(D);
                        buctVar.g(cmrv.CUSTOM);
                        cmre cmreVar = (cmre) cmrf.a.createBuilder();
                        cmreVar.getClass();
                        for (String str : V) {
                            cmrn cmrnVar = (cmrn) cmro.a.createBuilder();
                            cmrk cmrkVar = (cmrk) cmrl.a.createBuilder();
                            cmrv cmrvVar = cmrv.CUSTOM;
                            cmrkVar.copyOnWrite();
                            ((cmrl) cmrkVar.instance).e = cmrvVar.a();
                            cmrkVar.copyOnWrite();
                            cmrl cmrlVar = (cmrl) cmrkVar.instance;
                            str.getClass();
                            cmrlVar.d = str;
                            cmrl cmrlVar2 = (cmrl) cmrkVar.build();
                            cmrnVar.copyOnWrite();
                            cmro cmroVar = (cmro) cmrnVar.instance;
                            cmrlVar2.getClass();
                            cmroVar.c = cmrlVar2;
                            cmroVar.b |= 1;
                            cmrr cmrrVar = (cmrr) cmrs.a.createBuilder();
                            cmrrVar.copyOnWrite();
                            cmrs cmrsVar = (cmrs) cmrrVar.instance;
                            cmrsVar.b |= 2;
                            cmrsVar.d = false;
                            cmrh cmrhVar = (cmrh) cmri.a.createBuilder();
                            cmrhVar.copyOnWrite();
                            ((cmri) cmrhVar.instance).c = true;
                            cmrrVar.copyOnWrite();
                            cmrs cmrsVar2 = (cmrs) cmrrVar.instance;
                            cmri cmriVar = (cmri) cmrhVar.build();
                            cmriVar.getClass();
                            cmrsVar2.c = cmriVar;
                            cmrsVar2.b |= 1;
                            cmrnVar.a((cmrs) cmrrVar.build());
                            cmreVar.b((cmro) cmrnVar.build());
                        }
                        buctVar.h((cmrf) cmreVar.build());
                        buctVar.b(new Supplier() { // from class: bucr
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new bucp();
                            }
                        }).s();
                    }
                }
                buuoVar.close();
                LoadReactionsReceiver.a.p("Done inserting reactions to messages");
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dawz(this.a, this.b, ffguVar);
    }
}
