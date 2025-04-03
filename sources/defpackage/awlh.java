package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awlh {
    private final awkt a;
    private final Set b;
    private final errl c;
    private final errl d;

    public awlh(awkt awktVar, Set set, errl errlVar, errl errlVar2) {
        this.a = awktVar;
        this.b = set;
        this.c = errlVar;
        this.d = errlVar2;
    }

    public final elfl a(final Object obj, final awkh awkhVar) {
        final String a = this.a.a(obj);
        int i = engw.d;
        engr engrVar = new engr();
        for (final awli awliVar : this.b) {
            engrVar.h(elfo.g(new Callable() { // from class: awlf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return awli.this.a(obj, awkhVar);
                }
            }, this.d));
        }
        return elfo.a(engrVar.g()).h(new emwl() { // from class: awlg
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                awxb awxbVar = (awxb) awxc.a.createBuilder();
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    awxbVar.mergeFrom((awxb) it.next());
                }
                String str = a;
                awxbVar.copyOnWrite();
                awxc awxcVar = (awxc) awxbVar.instance;
                str.getClass();
                awxcVar.b |= 1;
                awxcVar.c = str;
                return (awxc) awxbVar.build();
            }
        }, this.c);
    }
}
