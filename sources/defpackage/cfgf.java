package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.NoSuchElementException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ UUID b;
    final /* synthetic */ cfgt c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfgf(ffgu ffguVar, UUID uuid, cfgt cfgtVar) {
        super(2, ffguVar);
        this.b = uuid;
        this.c = cfgtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfgf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        UUID uuid;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                uuid = (UUID) this.d;
                ffci.b(obj);
            } else {
                ffci.b(obj);
                UUID uuid2 = this.b;
                ListenableFuture d = this.c.f.d(uuid2);
                this.d = uuid2;
                this.a = 1;
                Object c = fgfz.c(d, this);
                if (c == ffhhVar) {
                    return ffhhVar;
                }
                uuid = uuid2;
                obj = c;
            }
            return new ffcf(uuid, obj);
        } catch (NoSuchElementException unused) {
            return new ffcf(this.b, null);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfgf cfgfVar = new cfgf(ffguVar, this.b, this.c);
        cfgfVar.d = obj;
        return cfgfVar;
    }
}
