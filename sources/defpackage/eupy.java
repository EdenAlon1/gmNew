package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupy {
    public static final void a(eupm eupmVar, List list) {
        list.add(eupmVar);
    }

    public static final void b(final ComponentRegistrar componentRegistrar, List list) {
        list.add(new euug() { // from class: eupx
            @Override // defpackage.euug
            public final Object a() {
                return ComponentRegistrar.this;
            }
        });
    }
}
