package defpackage;

import com.google.android.ims.rcsservice.chatsession.ChatSessionEvent;
import com.google.android.ims.rcsservice.chatsession.GroupChatSessionEvent;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.group.UserInfo;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dijf implements dkkx {
    final /* synthetic */ dijk a;

    public dijf(dijk dijkVar) {
        this.a = dijkVar;
    }

    @Override // defpackage.dkkx
    public final void a(dkkj dkkjVar, String str, boolean z) {
        Event chatSessionEvent;
        if (dion.a(this.a.h, str)) {
            dkty.c("Discarding is-composing indicator for blocked user: %s", dktx.USER_ID.c(str));
            return;
        }
        dkty.c("Getting is composing indicator for: %s state: %b", dktx.USER_ID.c(str), Boolean.valueOf(z));
        long j = true != z ? 0L : 1L;
        if (dkkjVar == null) {
            chatSessionEvent = new ChatSessionEvent(50050, 0L, 1L, str);
        } else {
            long m = this.a.m(dkkjVar);
            if (dkkjVar.E) {
                final dijk dijkVar = this.a;
                Optional a = dijkVar.j.a(m);
                final String m2 = dkut.m(str, (String) dijkVar.p.a().map(new Function() { // from class: diiu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        dktn dktnVar = dijk.d;
                        return ((djtp) obj).m().n();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(""), dijkVar.n, ((Boolean) dijkVar.p.a().map(new Function() { // from class: diiv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        dktn dktnVar = dijk.d;
                        return Boolean.valueOf("tel".equals(((djtp) obj).m().o()));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(true)).booleanValue());
                Optional flatMap = a.flatMap(new Function() { // from class: diis
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((dkrn) obj).b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).flatMap(new Function() { // from class: diit
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((dilk) obj).d.a(m2, dijk.this.n);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (flatMap.isEmpty()) {
                    dkty.c("user is not found with sessionId %d", Long.valueOf(m));
                }
                if (flatMap.isPresent()) {
                    UserInfo o = this.a.o((dimg) flatMap.get());
                    dkmq dkmqVar = new dkmq(50050, m, j);
                    dkmqVar.b(o);
                    chatSessionEvent = new GroupChatSessionEvent(dkmqVar);
                } else {
                    chatSessionEvent = null;
                }
            } else {
                chatSessionEvent = new ChatSessionEvent(50050, m, j, str);
            }
        }
        if (chatSessionEvent != null) {
            this.a.g.c(chatSessionEvent, dkuj.IMS_CHAT_SESSION_PROVIDER);
        }
    }
}
