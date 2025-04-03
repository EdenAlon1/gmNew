package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes8.dex */
public interface crji {
    Uri a();

    Uri b(Uri uri, Uri uri2);

    Uri c(Uri uri, byzi byziVar);

    RectF[] d(int i, int i2, int i3);

    Uri e(CharSequence charSequence, aoku aokuVar, ParticipantColor participantColor);

    Uri f(Uri uri, CharSequence charSequence, aoku aokuVar, ParticipantColor participantColor);

    Uri g(Uri uri, CharSequence charSequence, aoku aokuVar, ParticipantColor participantColor, boolean z, boolean z2, boolean z3);

    Uri h(Uri uri, CharSequence charSequence, aoku aokuVar, ParticipantColor participantColor, boolean z, boolean z2, boolean z3);

    Bitmap i(String str, int i, int i2, boolean z, boolean z2, Integer num, crjh crjhVar, boolean z3, boolean z4, boolean z5);

    Bitmap j(String str, String str2, int i, int i2, Integer num, crjh crjhVar, boolean z, OptionalInt optionalInt);
}
