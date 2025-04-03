package com.google.android.setupdesign.items;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import defpackage.eiqc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ItemGroup extends AbstractItemHierarchy {
    public final List b;
    public boolean c;
    private final SparseIntArray d;
    private int e;

    public ItemGroup() {
        this.b = new ArrayList();
        this.d = new SparseIntArray();
        this.e = 0;
        this.c = false;
    }

    private final void h() {
        if (this.c) {
            this.e = 0;
            this.d.clear();
            for (int i = 0; i < this.b.size(); i++) {
                eiqc eiqcVar = (eiqc) this.b.get(i);
                if (eiqcVar.a() > 0) {
                    this.d.put(i, this.e);
                }
                this.e += eiqcVar.a();
            }
            this.c = false;
        }
    }

    @Override // defpackage.eiqc
    public final int a() {
        h();
        return this.e;
    }

    public final int b(eiqc eiqcVar) {
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (list.get(i) == eiqcVar) {
                break;
            }
            i++;
        }
        h();
        if (i == -1) {
            return -1;
        }
        int size2 = this.b.size();
        int i2 = -1;
        while (i2 < 0 && i < size2) {
            i2 = this.d.get(i, -1);
            i++;
        }
        return i2 < 0 ? a() : i2;
    }

    public void f(eiqc eiqcVar, int i) {
        this.c = true;
        int b = b(eiqcVar);
        if (b >= 0) {
            d(b + i);
        } else {
            Log.e("ItemGroup", "Unexpected child remove ".concat(eiqcVar.toString()));
        }
    }

    public void g(eiqc eiqcVar, int i) {
        this.c = true;
        int b = b(eiqcVar);
        if (b >= 0) {
            e(b + i);
        } else {
            Log.e("ItemGroup", "Unexpected child insert ".concat(eiqcVar.toString()));
        }
    }

    public ItemGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
        this.d = new SparseIntArray();
        this.e = 0;
        this.c = false;
    }
}
