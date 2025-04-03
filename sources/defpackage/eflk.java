package defpackage;

import android.content.ContentValues;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eflk extends eflx {
    public ContentValues a;
    public engw b;
    public engw c;
    public String d;
    public eflw e;

    @Override // defpackage.eflx
    public final ContentValues a() {
        ContentValues contentValues = this.a;
        if (contentValues != null) {
            return contentValues;
        }
        throw new IllegalStateException("Property \"values\" has not been set");
    }

    @Override // defpackage.eflx
    public final void b(List list) {
        this.b = engw.n(list);
    }

    @Override // defpackage.eflx
    public final void c(List list) {
        this.c = engw.n(list);
    }
}
