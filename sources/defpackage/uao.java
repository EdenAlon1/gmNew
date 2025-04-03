package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uao implements eknz {
    final /* synthetic */ Uri a;
    final /* synthetic */ uar b;

    public uao(uar uarVar, Uri uri) {
        this.a = uri;
        this.b = uarVar;
    }

    @Override // defpackage.eknz
    public final emxc a() {
        return emux.a;
    }

    @Override // defpackage.eknz
    public final ListenableFuture c() {
        final Uri uri = this.a;
        return elfo.g(new Callable() { // from class: uan
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eknx a;
                ekzz f = eleg.f("ConversationDeeplinkGatewayHandler#getRedirectIntent");
                final Uri uri2 = uri;
                uao uaoVar = uao.this;
                try {
                    buxo d = MessagesTable.d();
                    d.z("ConversationDeeplinkGatewayHandler#getMessage");
                    buum buumVar = MessagesTable.c;
                    d.c(buumVar.a, buumVar.b);
                    d.h(new Function() { // from class: uam
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            buxzVar.ab(uri2);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsob e = bsom.e();
                    bskp bskpVar = bsom.c;
                    e.c(bskpVar.a, bskpVar.y, bskpVar.R);
                    dtvy i = dtvz.i(e.b(), bsom.c.a, MessagesTable.c.b);
                    ((dtrd) i).e = "message_to_conversation_tag";
                    d.G(i.g());
                    MessagesTable.BindData bindData = (MessagesTable.BindData) ((buuo) d.b().o()).cS();
                    if (bindData != null && bindData.C() != null) {
                        bseh bsehVar = ((bseh[]) bindData.aG("message_to_conversation_tag", new bseh[0]))[0];
                        a = uaoVar.b.a(uaoVar.b.b.a(bsehVar.C(), bsehVar.aa(), bsehVar.am()), bindData.D());
                        f.close();
                        return a;
                    }
                    a = eknx.a("Cannot find message by smsUri.");
                    f.close();
                    return a;
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.b.a);
    }

    @Override // defpackage.eknz
    public final /* synthetic */ eknx e() {
        return ekny.a();
    }

    @Override // defpackage.eknz
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.eknz
    public final /* synthetic */ void d() {
    }
}
