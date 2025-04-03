package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxt implements ejuh {
    public final cqoh a;
    public final errl b;
    public final alxl c;
    public final ffbr d;
    public final ffbr e;
    public final engw f;
    public final AtomicReference g = new AtomicReference(ejug.a);
    private final errl h;
    private final Optional i;

    public vxt(cqoh cqohVar, errl errlVar, errl errlVar2, alxl alxlVar, ffbr ffbrVar, ffbr ffbrVar2, engw engwVar, Optional optional) {
        this.a = cqohVar;
        this.b = errlVar;
        this.h = errlVar2;
        this.c = alxlVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = engwVar;
        this.i = optional;
        emxf.b(!engwVar.isEmpty(), "Unable to create a conversation with empty Recipients.");
    }

    @Override // defpackage.ejuh
    public final erph a() {
        ekzz f = eleg.f("MessageDataSource#CreateConversationDatasource#LoadData");
        try {
            erph erphVar = new erph(erqt.i((ejug) this.g.get()));
            f.a(erphVar);
            f.close();
            return erphVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        ekzz f = eleg.f("MessageDataSource#CreateConversationDatasource#FetchAndStoreData");
        try {
            elfl i = ((elfl) this.i.map(new Function() { // from class: vxq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bdtd) vxt.this.d.b()).g(((Integer) obj).intValue()).g();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: vxr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((aqvh) vxt.this.e.b()).d((SelfIdentityId) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(elfo.e(Optional.empty()))).i(new eroh() { // from class: vxs
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final vxt vxtVar = vxt.this;
                    return vxtVar.c.m((Optional) obj, vxtVar.f, null).h(new emwl() { // from class: vxp
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            vxt vxtVar2 = vxt.this;
                            vxtVar2.g.getAndSet(ejug.a((Conversation) obj2, vxtVar2.a.f()));
                            return null;
                        }
                    }, vxtVar.b);
                }
            }, this.h);
            f.b(i);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final /* synthetic */ Object c() {
        return "create_conversation_data_source";
    }
}
