package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;
import j$.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface cylx extends bcvn {
    wdm B();

    Object J(Function function, Function function2);

    void R();

    void T(Consumer consumer, Consumer consumer2);

    void aB(boolean z);

    void aT(bcvr bcvrVar, boolean z, boolean z2);

    void aU();

    boolean aY();

    void ah();

    void aj();

    void ao();

    void ap(boolean z);

    void as(MessageCoreData messageCoreData, Instant instant);

    void aw(MessageCoreData messageCoreData, long j, long j2, boolean z, Optional optional, Optional optional2);

    boolean bh();

    boolean bj();

    Activity p();
}
