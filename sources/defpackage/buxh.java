package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buxh extends dtvh {
    public buxh() {
        super("messages", "$primary");
    }

    @Override // defpackage.dtvh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final buxg b() {
        return new buxg(this.a.a(), this.b);
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = MessagesTable.a;
        apply = function.apply(new buxz());
        this.b = new buxs((buxz) apply);
    }
}
