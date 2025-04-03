package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exum {
    public final exuh a;

    public exum(exuh exuhVar) {
        this.a = exuhVar;
    }

    public final /* synthetic */ exuk a() {
        eyfy build = this.a.build();
        build.getClass();
        return (exuk) build;
    }

    public final /* synthetic */ eyjx b() {
        List unmodifiableList = DesugarCollections.unmodifiableList(((exuk) this.a.instance).f);
        unmodifiableList.getClass();
        return new eyjx(unmodifiableList);
    }
}
