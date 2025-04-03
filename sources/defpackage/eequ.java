package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eequ extends lov {
    private List j;

    public eequ(Context context) {
        super(context.getApplicationContext());
    }

    @Override // defpackage.lov
    public final /* bridge */ /* synthetic */ Object a() {
        TreeSet treeSet = new TreeSet();
        String[] split = eeqx.a(this.c.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str : split) {
            int indexOf = str.indexOf(32);
            String[] split2 = str.substring(0, indexOf).split(":");
            emxf.p(split2.length == 2 && indexOf > 0, "Invalid license meta-data line:\n%s", str);
            arrayList.add(new eeqs(str.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1])));
        }
        Collections.sort(arrayList);
        treeSet.addAll(arrayList);
        return DesugarCollections.unmodifiableList(new ArrayList(treeSet));
    }

    @Override // defpackage.lox
    protected final void m() {
        List list = this.j;
        if (list != null) {
            j(list);
        } else {
            f();
        }
    }

    @Override // defpackage.lox
    protected final void n() {
        h();
    }

    @Override // defpackage.lox
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void j(List list) {
        this.j = list;
        super.j(list);
    }
}
