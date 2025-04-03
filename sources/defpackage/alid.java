package defpackage;

import com.android.vcard.VCardConfig;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alid implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.BUGLE_MEDIA_VIEWER;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        return new BiConsumer() { // from class: alib
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eolu eoluVar = (eolu) obj;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eonm eonmVar = (eonm) ((eonl) obj2).build();
                eolv eolvVar2 = eolv.a;
                eonmVar.getClass();
                eolvVar.Z = eonmVar;
                eolvVar.c |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: alic
            @Override // java.util.function.Supplier
            public final Object get() {
                return (eonl) eonm.a.createBuilder();
            }
        };
    }
}
