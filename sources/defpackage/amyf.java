package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amyf implements ctbj {
    final /* synthetic */ amyi a;
    private ctbx b;

    public amyf(amyi amyiVar) {
        this.a = amyiVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final amyi amyiVar = this.a;
        bqfs a = bqfx.a();
        a.z("createBusinessConversationsMetadataQuery");
        final amyi amyiVar2 = this.a;
        a.c(new Function() { // from class: amxz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqfw bqfwVar = (bqfw) obj;
                bqfwVar.b(amyi.this.c.l().a);
                return bqfwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.b = ctbt.b(amyiVar.c.n().a(new aqgd() { // from class: amye
            @Override // defpackage.aqgd
            public final elfl a() {
                return amyi.this.d();
            }
        }), amyiVar2.a.a(a.b(), "RbmConversationPropertiesObservableSupplier#businessConversationsMetadataQuery").f(new ctbf() { // from class: amya
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return amyi.this.d();
            }
        }, "RbmConversationPropertiesObservableSupplier::register", "RbmConversationPropertiesObservableSupplier::callback", "RbmConversationPropertiesObservableSupplier::unregister"));
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.b;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.b = null;
    }
}
