package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aezx {
    public abstract SuperSortLabel a();

    public abstract ParticipantsTable.BindData b();

    public abstract engi c();

    public abstract engw d();

    public abstract boolean e();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f() {
        engw d = d();
        int i = ((enou) d).c;
        int i2 = 0;
        while (i2 < i) {
            boolean isEmpty = TextUtils.isEmpty(((ParticipantsTable.BindData) d.get(i2)).T());
            i2++;
            if (!isEmpty) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        return ((enou) d()).c > 1;
    }
}
