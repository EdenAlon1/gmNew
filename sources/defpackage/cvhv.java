package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhv {
    private final cvhw a;

    public cvhv(cvhw cvhwVar) {
        this.a = cvhwVar;
    }

    public final /* synthetic */ cvhx a() {
        eyfy build = this.a.build();
        build.getClass();
        return (cvhx) build;
    }

    public final /* synthetic */ eyjx b() {
        List unmodifiableList = DesugarCollections.unmodifiableList(((cvhx) this.a.instance).b);
        unmodifiableList.getClass();
        return new eyjx(unmodifiableList);
    }

    public final /* synthetic */ void c(eyjx eyjxVar, Iterable iterable) {
        eyjxVar.getClass();
        iterable.getClass();
        cvhw cvhwVar = this.a;
        cvhwVar.copyOnWrite();
        cvhx cvhxVar = (cvhx) cvhwVar.instance;
        cvhx cvhxVar2 = cvhx.a;
        eygr eygrVar = cvhxVar.b;
        if (!eygrVar.c()) {
            cvhxVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, cvhxVar.b);
    }
}
