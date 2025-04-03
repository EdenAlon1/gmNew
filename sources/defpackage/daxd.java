package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.debug.LoadRepliesReceiver;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxd extends ffhv implements ffjm {
    final /* synthetic */ LoadRepliesReceiver a;
    final /* synthetic */ Iterator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daxd(LoadRepliesReceiver loadRepliesReceiver, Iterator it, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = loadRepliesReceiver;
        this.b = it;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daxd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        fazb fazbVar = this.a.d;
        ffbr ffbrVar = null;
        if (fazbVar == null) {
            ffkj.c("syncManager");
            fazbVar = null;
        }
        ((coxg) fazbVar.b()).q(false);
        ffbr ffbrVar2 = this.a.e;
        if (ffbrVar2 == null) {
            ffkj.c("transactionManager");
        } else {
            ffbrVar = ffbrVar2;
        }
        dtuu dtuuVar = (dtuu) ffbrVar.b();
        final Iterator it = this.b;
        dtuuVar.d("LoadRepliesReceiver#transaction", new Runnable() { // from class: daxc
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = bufy.a;
                bufn bufnVar = new bufn();
                bufnVar.f("LoadRepliesReceiver#processBroadcast.delete");
                bufnVar.e();
                bufnVar.d();
                buxo d = MessagesTable.d();
                d.z("LoadRepliesReceiver.processBroadcast");
                d.e(new Function() { // from class: daxb
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
                    MessagesTable.BindData bindData = (MessagesTable.BindData) buuoVar.cO();
                    List<String> V = ffpc.V((CharSequence) it2.next(), new String[]{", "}, 4, 2);
                    ArrayList arrayList = new ArrayList(ffdx.n(V, 10));
                    for (String str : V) {
                        if (true == ffkj.e(str, "null")) {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                    CharSequence charSequence = (CharSequence) arrayList.get(0);
                    if (charSequence == null || ffpc.J(charSequence)) {
                        LoadRepliesReceiver.a.p("Skipping: the message " + arrayList.get(1) + " is not indicated a reply");
                    } else {
                        LoadRepliesReceiver.a.p("Processing reply data " + arrayList.get(0) + " " + arrayList.get(1) + ", " + arrayList.get(2) + ", " + arrayList.get(3) + " for message " + bindData.D());
                        buet buetVar = new buet();
                        buetVar.d(bdhb.b((String) arrayList.get(1)));
                        buetVar.e(bdhb.b((String) arrayList.get(2)));
                        buetVar.f(ffkj.e(arrayList.get(3), "0") ? ajrb.UNSPECIFIED : ajrb.REPLIED_TO_MESSAGE_NOT_FOUND);
                        bueo c = buetVar.c();
                        LoadRepliesReceiver.a.p("Inserted reply " + c.l() + " to message " + c.m());
                    }
                }
                buuoVar.close();
                LoadRepliesReceiver.a.p("Done inserting replies");
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new daxd(this.a, this.b, ffguVar);
    }
}
