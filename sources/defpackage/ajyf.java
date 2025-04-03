package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajyf extends ffhv implements ffjm {
    final /* synthetic */ ajyr a;
    final /* synthetic */ UUID b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajyf(ffgu ffguVar, ajyr ajyrVar, UUID uuid) {
        super(2, ffguVar);
        this.a = ajyrVar;
        this.b = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajyf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final UUID uuid = this.b;
        uuid.getClass();
        bxkz a = bxle.a();
        a.z("RestoreWorkflowSettingsService#getRestoreExecutionSync");
        a.c(new Function() { // from class: ajwq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bxld bxldVar = (bxld) obj2;
                entd entdVar = ajyr.a;
                bxldVar.b(Optional.of(uuid));
                return bxldVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bxjb bxjbVar = (bxjb) ((bxkf) a.b().o()).cS();
        if (bxjbVar != null) {
            return ajyr.y(bxjbVar);
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajyf ajyfVar = new ajyf(ffguVar, this.a, this.b);
        ajyfVar.c = obj;
        return ajyfVar;
    }
}
