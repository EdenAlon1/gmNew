package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassifier;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewzb {
    private final List a;
    private final List b;
    private final List c;
    private final boolean d;

    public ewzb(Collection collection, Collection collection2, boolean z) {
        this.c = collection == null ? Collections.EMPTY_LIST : new ArrayList(collection);
        this.b = collection2 == null ? Collections.EMPTY_LIST : new ArrayList(collection2);
        int i = engw.d;
        this.a = enou.a;
        this.d = z;
    }

    public final TextClassifier.EntityConfig a() {
        TextClassifier.EntityConfig.Builder includedTypes;
        TextClassifier.EntityConfig.Builder excludedTypes;
        TextClassifier.EntityConfig.Builder hints;
        TextClassifier.EntityConfig.Builder includeTypesFromTextClassifier;
        TextClassifier.EntityConfig build;
        TextClassifier.EntityConfig createWithExplicitEntityList;
        TextClassifier.EntityConfig create;
        if (Build.VERSION.SDK_INT >= 29) {
            includedTypes = new TextClassifier.EntityConfig.Builder().setIncludedTypes(this.c);
            excludedTypes = includedTypes.setExcludedTypes(this.b);
            hints = excludedTypes.setHints(this.a);
            includeTypesFromTextClassifier = hints.includeTypesFromTextClassifier(this.d);
            build = includeTypesFromTextClassifier.build();
            return build;
        }
        if (this.d) {
            create = TextClassifier.EntityConfig.create(this.a, this.c, this.b);
            return create;
        }
        cmj cmjVar = new cmj(this.c);
        cmjVar.removeAll(this.b);
        createWithExplicitEntityList = TextClassifier.EntityConfig.createWithExplicitEntityList(new ArrayList(cmjVar));
        return createWithExplicitEntityList;
    }

    public final Collection b(Collection collection) {
        cmj cmjVar = new cmj();
        if (this.d && collection != null) {
            cmjVar.addAll(collection);
        }
        cmjVar.addAll(this.c);
        cmjVar.removeAll(this.b);
        return DesugarCollections.unmodifiableCollection(cmjVar);
    }
}
