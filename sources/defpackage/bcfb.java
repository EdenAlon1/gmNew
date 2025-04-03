package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcfb implements bbin {
    private final cqoh a;

    public bcfb(cqoh cqohVar) {
        cqohVar.getClass();
        this.a = cqohVar;
    }

    @Override // defpackage.bbin
    public final void a() {
        String[] strArr = bcfa.a;
        bcet bcetVar = new bcet();
        bcetVar.f("BackupMetadataTableWriter");
        bcetVar.e();
        bcetVar.b().b();
    }

    @Override // defpackage.bbin
    public final void b(bbim bbimVar) {
        bbimVar.getClass();
        String[] strArr = bcfa.a;
        bcee bceeVar = new bcee();
        bceeVar.c(this.a.f());
        bceeVar.b(UUID.randomUUID().toString());
        bceeVar.d(140);
        bcdz a = bceeVar.a(new Supplier() { // from class: bcec
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bcea();
            }
        });
        final dtve b = bcfa.b();
        dtub.b(bcfa.b(), "backup_metadata", a, new Function() { // from class: bcdx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.S("backup_metadata", (ContentValues) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bcdy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
