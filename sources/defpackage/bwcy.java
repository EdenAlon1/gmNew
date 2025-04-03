package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwcy extends dtvh {
    public bwcy() {
        super("parts", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = PartsTable.a;
        apply = function.apply(new bwdm());
        this.b = new bwdj((bwdm) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new bwcx(this.a.a(), this.b);
    }
}
