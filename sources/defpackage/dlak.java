package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlak implements dlaj {
    private final Optional a;
    private final Map b;

    public dlak(Optional optional, Map map) {
        this.a = optional;
        this.b = map;
    }

    private final dlgd d(String str) {
        dlgd dlgdVar = (dlgd) this.b.get(str);
        if (dlgdVar != null) {
            return dlgdVar;
        }
        ffbr ffbrVar = (ffbr) fflm.b(this.a);
        dlgd dlgdVar2 = ffbrVar != null ? (dlgd) ffbrVar.b() : null;
        return dlgdVar2 == null ? dlgd.a : dlgdVar2;
    }

    @Override // defpackage.dlaj
    public final rug a(String str) {
        dlgd d = d(str);
        ruf rufVar = (ruf) rug.a.createBuilder();
        rufVar.getClass();
        DesugarCollections.unmodifiableList(((rug) rufVar.instance).b).getClass();
        Set set = d.b;
        rufVar.copyOnWrite();
        rug rugVar = (rug) rufVar.instance;
        eygr eygrVar = rugVar.b;
        if (!eygrVar.c()) {
            rugVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(set, rugVar.b);
        eyfy build = rufVar.build();
        build.getClass();
        return (rug) build;
    }

    @Override // defpackage.dlaj
    public final dlgo b(String str) {
        return d(str).c;
    }

    @Override // defpackage.dlaj
    public final boolean c(String str) {
        return d(str).e;
    }
}
