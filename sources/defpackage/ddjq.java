package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddjq {
    public final ddkz a;

    public ddjq(ddkz ddkzVar) {
        this.a = ddkzVar;
    }

    public final ListenableFuture a() {
        return elfr.j(this.a.a.a(), new emwl() { // from class: ddky
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ddkv) obj).b;
            }
        }, erpp.a);
    }

    public final void b(final List list) {
        csvs.c(elfl.g(a()).h(new emwl() { // from class: ddjo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(!list.equals((List) obj));
            }
        }, erpp.a).i(new eroh() { // from class: ddjp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    return erqt.i(null);
                }
                final List list2 = list;
                ddjq ddjqVar = ddjq.this;
                return ddjqVar.a.a.b(new emwl() { // from class: ddkx
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ddku ddkuVar = (ddku) ((ddkv) obj2).toBuilder();
                        ddkuVar.copyOnWrite();
                        ((ddkv) ddkuVar.instance).b = eyfy.emptyProtobufList();
                        ddkuVar.copyOnWrite();
                        ddkv ddkvVar = (ddkv) ddkuVar.instance;
                        eygr eygrVar = ddkvVar.b;
                        if (!eygrVar.c()) {
                            ddkvVar.b = eyfy.mutableCopy(eygrVar);
                        }
                        eydl.addAll(list2, ddkvVar.b);
                        return (ddkv) ddkuVar.build();
                    }
                }, erpp.a);
            }
        }, erpp.a), "Bugle", "Failed to update current reminder notification reminder IDs");
    }
}
