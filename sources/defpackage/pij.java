package defpackage;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.reflection.Consumer2;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pij {
    public final ActivityEmbeddingComponent a;
    public final phm b;
    public final pgp c;
    public final pgl d;

    public pij(ActivityEmbeddingComponent activityEmbeddingComponent, phm phmVar, pgp pgpVar) {
        activityEmbeddingComponent.getClass();
        this.a = activityEmbeddingComponent;
        this.b = phmVar;
        this.c = pgpVar;
        this.d = new pgk();
    }

    public final void a(final pim pimVar) {
        this.a.setSplitInfoCallback(new Consumer2() { // from class: pif
            @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                List list = (List) obj;
                list.getClass();
                this.b.a(list);
                pim.this.b();
            }
        });
    }
}
