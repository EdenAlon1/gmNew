package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwjs extends cpdo {
    public final ffbr a;
    public final fazb b;
    private final Context c;
    private final errl d;

    public cwjs(Context context, ffbr ffbrVar, errl errlVar, fazb fazbVar) {
        this.c = context;
        this.a = ffbrVar;
        this.d = errlVar;
        this.b = fazbVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("PhenotypeRestoreStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        ((cfud) this.a.b()).d(this.c);
        return elfl.g(elfl.g(((coly) this.b.b()).a.a()).h(new emwl() { // from class: colv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((akuu) obj).d);
            }
        }, erpp.a)).i(new eroh() { // from class: cwjq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return erqt.i(null);
                }
                cwjs cwjsVar = cwjs.this;
                ((cfud) cwjsVar.a.b()).e();
                return elfl.g(((coly) cwjsVar.b.b()).a.b(new emwl() { // from class: colw
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        akut akutVar = (akut) ((akuu) obj2).toBuilder();
                        akutVar.copyOnWrite();
                        akuu akuuVar = (akuu) akutVar.instance;
                        akuuVar.b |= 4;
                        akuuVar.d = false;
                        return (akuu) akutVar.build();
                    }
                }, erpp.a)).e(IOException.class, new emwl() { // from class: cwjr
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, erpp.a);
            }
        }, this.d);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return false;
    }
}
