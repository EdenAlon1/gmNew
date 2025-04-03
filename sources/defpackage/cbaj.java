package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.android.vcard.VCardEntry;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbaj {
    private static final cskc e = cskc.g("Bugle", "VCardResourceEntry");
    public final Context a;
    public final List b;
    public final Uri c;
    public final String d;

    public cbaj(Context context, VCardEntry vCardEntry, Uri uri) {
        this.a = context;
        this.b = a(context, vCardEntry);
        String displayName = vCardEntry.getDisplayName();
        if (displayName == null) {
            vCardEntry.consolidateFields();
            displayName = vCardEntry.getDisplayName();
        }
        this.d = displayName;
        this.c = uri;
    }

    private static List a(Context context, VCardEntry vCardEntry) {
        String str;
        String str2;
        String str3;
        Resources resources = context.getResources();
        ArrayList arrayList = new ArrayList();
        if (vCardEntry.getPhoneList() != null) {
            for (VCardEntry.PhoneData phoneData : vCardEntry.getPhoneList()) {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:".concat(String.valueOf(phoneData.getNumber()))));
                arrayList.add(new cbai(phoneData.getNumber(), ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, phoneData.getType(), phoneData.getLabel()).toString(), intent));
            }
        }
        if (vCardEntry.getEmailList() != null) {
            for (VCardEntry.EmailData emailData : vCardEntry.getEmailList()) {
                Intent intent2 = new Intent("android.intent.action.SENDTO");
                intent2.setData(Uri.parse("mailto:"));
                intent2.putExtra("android.intent.extra.EMAIL", new String[]{emailData.getAddress()});
                arrayList.add(new cbai(emailData.getAddress(), ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, emailData.getType(), emailData.getLabel()).toString(), intent2));
            }
        }
        if (vCardEntry.getPostalList() != null) {
            for (VCardEntry.PostalData postalData : vCardEntry.getPostalList()) {
                try {
                    str3 = resources.getStringArray(R.array.postalAddressTypes)[postalData.getType() - 1];
                } catch (Resources.NotFoundException unused) {
                    str3 = resources.getStringArray(R.array.postalAddressTypes)[2];
                } catch (Exception e2) {
                    e.o("createContactItem postal Exception.", e2);
                    str3 = resources.getStringArray(R.array.postalAddressTypes)[2];
                }
                Intent intent3 = new Intent("android.intent.action.VIEW");
                StringBuilder sb = new StringBuilder();
                String pobox = postalData.getPobox();
                if (!TextUtils.isEmpty(pobox)) {
                    sb.append(pobox);
                    sb.append(" ");
                }
                String extendedAddress = postalData.getExtendedAddress();
                if (!TextUtils.isEmpty(extendedAddress)) {
                    sb.append(extendedAddress);
                    sb.append(" ");
                }
                String street = postalData.getStreet();
                if (!TextUtils.isEmpty(street)) {
                    sb.append(street);
                    sb.append(" ");
                }
                String localty = postalData.getLocalty();
                if (!TextUtils.isEmpty(localty)) {
                    sb.append(localty);
                    sb.append(" ");
                }
                String region = postalData.getRegion();
                if (!TextUtils.isEmpty(region)) {
                    sb.append(region);
                    sb.append(" ");
                }
                String postalCode = postalData.getPostalCode();
                if (!TextUtils.isEmpty(postalCode)) {
                    sb.append(postalCode);
                    sb.append(" ");
                }
                String country = postalData.getCountry();
                if (!TextUtils.isEmpty(country)) {
                    sb.append(country);
                }
                String sb2 = sb.toString();
                try {
                    intent3.setData(Uri.parse(a.t(URLEncoder.encode(sb2, "UTF-8"), "geo:0,0?q=")));
                } catch (UnsupportedEncodingException unused2) {
                    intent3 = null;
                }
                arrayList.add(new cbai(sb2, str3, intent3));
            }
        }
        if (vCardEntry.getImList() != null) {
            for (VCardEntry.ImData imData : vCardEntry.getImList()) {
                try {
                    str2 = resources.getString(ContactsContract.CommonDataKinds.Im.getProtocolLabelResource(imData.getProtocol()));
                } catch (Resources.NotFoundException unused3) {
                    str2 = null;
                }
                arrayList.add(new cbai(imData.getAddress(), str2, null));
            }
        }
        if (vCardEntry.getOrganizationList() != null) {
            for (VCardEntry.OrganizationData organizationData : vCardEntry.getOrganizationList()) {
                try {
                    str = resources.getString(ContactsContract.CommonDataKinds.Organization.getTypeLabelResource(organizationData.getType()));
                } catch (Resources.NotFoundException unused4) {
                    str = resources.getStringArray(R.array.organizationTypes)[1];
                } catch (Exception e3) {
                    e.o("createContactItem org Exception.", e3);
                    str = resources.getStringArray(R.array.organizationTypes)[1];
                }
                arrayList.add(new cbai(organizationData.getOrganizationName(), str, null));
            }
        }
        if (vCardEntry.getWebsiteList() != null) {
            for (VCardEntry.WebsiteData websiteData : vCardEntry.getWebsiteList()) {
                if (websiteData != null && TextUtils.isGraphic(websiteData.getWebsite())) {
                    String website = websiteData.getWebsite();
                    if (!website.startsWith("http://") && !website.startsWith("https://")) {
                        website = "http://".concat(String.valueOf(website));
                    }
                    arrayList.add(new cbai(websiteData.getWebsite(), null, new Intent("android.intent.action.VIEW", Uri.parse(website))));
                }
            }
        }
        if (vCardEntry.getBirthday() != null) {
            String birthday = vCardEntry.getBirthday();
            if (TextUtils.isGraphic(birthday)) {
                arrayList.add(new cbai(birthday, resources.getString(com.google.android.apps.messaging.R.string.vcard_detail_birthday_label), null));
            }
        }
        if (vCardEntry.getNotes() != null) {
            for (VCardEntry.NoteData noteData : vCardEntry.getNotes()) {
                if (TextUtils.isGraphic(noteData.getNote())) {
                    arrayList.add(new cbai(noteData.getNote(), resources.getString(com.google.android.apps.messaging.R.string.vcard_detail_notes_label), null));
                }
            }
        }
        return arrayList;
    }
}
